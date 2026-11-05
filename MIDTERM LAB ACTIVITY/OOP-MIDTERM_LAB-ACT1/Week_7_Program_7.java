import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Week_7_Program_7 {
	public static void main(String[] args) {
		if (args.length != 6) {
			System.err.println("Usage: java TabFileImporter <jdbcUrl> <username> <password> <table> <file> <comma-separated-columns>");
			return;
		}

		String jdbcUrl = args[0], username = args[1], password = args[2];
		String table = args[3];
		Path file = Path.of(args[4]);
		String[] columns = args[5].split(",", -1);
		if (!isIdentifier(table) || Arrays.stream(columns).anyMatch(c -> !isIdentifier(c))) {
			System.err.println("Invalid table or column identifier.");
			return;
		}

		String sql = "INSERT INTO " + table + " (" + String.join(", ", columns) + ") VALUES ("
				+ Arrays.stream(columns).map(c -> "?").collect(Collectors.joining(", ")) + ")";

		try (Scanner scanner = new Scanner(System.in)) {
			boolean again;
			do {
				System.out.println("Choose the program you want to run");
				for (int i = 1; i <= 5; i++) System.out.println("Number " + i);
				System.out.println("Number 6");
				System.out.println("Number 6");
				String choice = scanner.nextLine().trim();
				if (choice.matches("[1-6]")) insertRecord(jdbcUrl, username, password, file, columns, sql);
				else System.out.println("Invalid choice.");
				System.out.print("Do you want to continue ? Y/N ");
				again = scanner.nextLine().trim().equalsIgnoreCase("Y");
			} while (again);
		}
	}

	private static void insertRecord(String url, String user, String password, Path file,
									 String[] columns, String sql) {
		try (BufferedReader reader = Files.newBufferedReader(file)) {
			String line = reader.readLine();
			if (line == null) {
				System.err.println("The input file is empty.");
				return;
			}
			String[] values = line.split("\t", -1);
			if (values.length != columns.length) {
				System.err.println("Record field count does not match the column count.");
				return;
			}
			try (Connection connection = DriverManager.getConnection(url, user, password);
				 PreparedStatement statement = connection.prepareStatement(sql)) {
				for (int i = 0; i < values.length; i++) statement.setString(i + 1, values[i]);
				statement.executeUpdate();
				System.out.println("Record inserted successfully.");
			}
		} catch (Exception e) {
			System.err.println("Import failed: " + e.getMessage());
		}
	}

	private static boolean isIdentifier(String value) {
		return value != null && Pattern.matches("[A-Za-z_][A-Za-z0-9_]*", value);
	}
}
