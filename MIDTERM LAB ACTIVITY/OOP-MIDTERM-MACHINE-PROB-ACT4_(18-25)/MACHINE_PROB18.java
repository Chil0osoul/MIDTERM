import java.util.Locale;
import java.util.Scanner;

public class MACHINE_PROB18 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Employee name: ");
		String name = scanner.nextLine();
		System.out.print("Employee ID: ");
		String employeeId = scanner.nextLine();
		System.out.print("Department: ");
		String department = scanner.nextLine();
		double monthlySalary = readAmount(scanner, "Basic monthly salary: ");

		System.out.print("Payroll start date (YYYY-MM-DD): ");
		String startDate = scanner.nextLine();
		System.out.print("Payroll end date (YYYY-MM-DD): ");
		String endDate = scanner.nextLine();
		System.out.print("Payout date (YYYY-MM-DD): ");
		String payoutDate = scanner.nextLine();

		double regularHours = readAmount(scanner, "Regular hours worked: ");
		double overtimeHours = readAmount(scanner, "Overtime hours worked: ");
		double absentDays = readAmount(scanner, "Number of absent days: ");

		double riceAllowance = readAmount(scanner, "Rice allowance: ");
		double transportationAllowance = readAmount(scanner, "Transportation allowance: ");
		double communicationAllowance = readAmount(scanner, "Communication allowance: ");

		double sss = readAmount(scanner, "SSS contribution: ");
		double philHealth = readAmount(scanner, "PhilHealth contribution: ");
		double pagIbig = readAmount(scanner, "PAG-IBIG contribution: ");
		double withholdingTax = readAmount(scanner, "Withholding tax: ");
		double otherDeductions = readAmount(scanner, "Other deductions: ");

		double hourlyRate = monthlySalary / 160.0;
		double dailyRate = monthlySalary / 20.0;
		double regularPay = regularHours * hourlyRate;
		double overtimePay = overtimeHours * (hourlyRate * 1.25);
		double absenceDeduction = absentDays * dailyRate;
		double totalAllowances = riceAllowance + transportationAllowance + communicationAllowance;
		double grossPay = regularPay + overtimePay + totalAllowances;
		double totalDeductions = sss + philHealth + pagIbig + withholdingTax
				+ otherDeductions + absenceDeduction;
		double netPay = grossPay - totalDeductions;

		System.out.println("\n                    *** Smart Employee Payslip ***");
		System.out.println("------------------------------------------------------------");
		System.out.println("Employee Details");
		System.out.printf("  %-25s %s%n", "Name:", name);
		System.out.printf("  %-25s %s%n", "Employee ID:", employeeId);
		System.out.printf("  %-25s %s%n", "Department:", department);
		System.out.println("\nPayroll Summary");
		System.out.printf("  %-25s %s to %s%n", "Pay Period:", startDate, endDate);
		System.out.printf("  %-25s %s%n", "Payout Date:", payoutDate);
		System.out.println("\nEarnings");
		printMoney("Regular Pay", regularPay);
		printMoney("Overtime Pay", overtimePay);
		printMoney("Total Allowances", totalAllowances);
		printMoney("Gross Pay", grossPay);
		System.out.println("\nAllowances Breakdown");
		printMoney("Rice Allowance", riceAllowance);
		printMoney("Transportation Allowance", transportationAllowance);
		printMoney("Communication Allowance", communicationAllowance);
		System.out.println("\nDeductions");
		printMoney("SSS", sss);
		printMoney("PhilHealth", philHealth);
		printMoney("PAG-IBIG", pagIbig);
		printMoney("Withholding Tax", withholdingTax);
		printMoney("Absence Deduction", absenceDeduction);
		printMoney("Other Deductions", otherDeductions);
		printMoney("Total Deductions", totalDeductions);
		System.out.println("------------------------------------------------------------");
		printMoney("NET PAY", netPay);
		System.out.println("------------------------------------------------------------");

		scanner.close();
	}

	private static double readAmount(Scanner scanner, String prompt) {
		System.out.print(prompt);
		return Double.parseDouble(scanner.nextLine());
	}

	private static void printMoney(String label, double amount) {
		System.out.printf("  %-25s %12.2f%n", label + ":", amount);
	}
}
