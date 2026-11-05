import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOP_MIDTERM_Lab_Act_6_Program_2 {
	static class HospitalDate {
		int year;
		int month;
		int day;

		HospitalDate(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

		@Override
		public String toString() {
			return String.format("%04d-%02d-%02d", year, month, day);
		}
	}

	static class Patient {
		String name;
		HospitalDate admissionDate;
		String disease;
		HospitalDate dischargeDate;

		void enterInformation(Scanner input) {
			System.out.print("Patient name: ");
			name = input.nextLine();
			System.out.println("Admission date (year month day):");
			admissionDate = readDate(input);
			System.out.print("Disease: ");
			disease = input.nextLine();
			System.out.println("Discharge date (year month day):");
			dischargeDate = readDate(input);
		}

		void displayInformation() {
			System.out.printf("Name: %s | Admission: %s | Disease: %s | Discharge: %s",
					name, admissionDate, disease, dischargeDate);
		}
	}

	static class AgePatient extends Patient {
		int age;

		@Override
		void enterInformation(Scanner input) {
			super.enterInformation(input);
			System.out.print("Age: ");
			age = Integer.parseInt(input.nextLine());
		}

		@Override
		void displayInformation() {
			super.displayInformation();
			System.out.printf(" | Age: %d%n", age);
		}
	}

	private static HospitalDate readDate(Scanner input) {
		String[] parts = input.nextLine().trim().split("\\s+");
		if (parts.length != 3) {
			throw new IllegalArgumentException("Enter the date as: year month day");
		}
		return new HospitalDate(Integer.parseInt(parts[0]),
				Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<AgePatient> patients = new ArrayList<>();

		System.out.print("Number of patients: ");
		int count = Integer.parseInt(input.nextLine());
		for (int i = 0; i < count; i++) {
			System.out.println("\nEnter information for patient " + (i + 1) + ":");
			AgePatient patient = new AgePatient();
			patient.enterInformation(input);
			patients.add(patient);
		}

		System.out.println("\nAll patients:");
		for (Patient patient : patients) {
			patient.displayInformation();
		}

		System.out.println("\nPediatric patients (under 12):");
		for (AgePatient patient : patients) {
			if (patient.age < 12) {
				patient.displayInformation();
			}
		}
	}
}
