import java.time.LocalDate;
import java.util.Objects;

public class Week_7_Program_6 {
    private String studentNo;
    private String studentName;
    private java.time.LocalDate dateOfBirth;
    private int tariffPoints;
    private static int noOfStudents = 0;

	public Week_7_Program_6() {
        this("not known", "not known", java.time.LocalDate.parse("1995-01-01"), 20);
    }

	public Week_7_Program_6(String studentNo, String studentName, java.time.LocalDate dateOfBirth, int tariffPoints) {
        setStudentNo(studentNo);
        setStudentName(studentName);
        setDateOfBirth(dateOfBirth);
        setTariffPoints(tariffPoints);
        noOfStudents++;
    }


	public String getStudentNo() { return studentNo; }
	public void setStudentNo(String studentNo) {
		this.studentNo = requireText(studentNo, "studentNo");
	}

	public String getStudentName() { return studentName; }
	public void setStudentName(String studentName) {
		this.studentName = requireText(studentName, "studentName");
	}

	private static String requireText(String value, String field) {
		Objects.requireNonNull(value, field);
		if (value.trim().isEmpty()) throw new IllegalArgumentException(field + " cannot be blank");
		return value.trim();
	}

	public LocalDate getDateOfBirth() { return dateOfBirth; }
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = Objects.requireNonNull(dateOfBirth, "dateOfBirth");
	}

	public int getTariffPoints() { return tariffPoints; }
	public void setTariffPoints(int tariffPoints) {
		if (tariffPoints < 20 || tariffPoints > 280)
			throw new IllegalArgumentException("Tariff points must be between 20 and 280");
		this.tariffPoints = tariffPoints;
	}

	public static int getNoOfStudents() { return noOfStudents; }

	public static void main(String[] args) {
		Week_7_Program_6 defaultStudent = new Week_7_Program_6();
		Week_7_Program_6 suppliedStudent = new Week_7_Program_6("S12345", "Alex Smith",
				LocalDate.parse("2005-06-15"), 240);
	}
}
