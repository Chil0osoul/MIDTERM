import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
	private String studentNo;
	private String studentName;
	private Date dateOfBirth;
	private Integer tariffPoints;
	private static int noOfStudents = 0;

	public Student() {
		this("not known", "not known", makeDate("1 January 1995"), 20);
	}

	public Student(String no, String name, Date dob, Integer points) {
		setStudentNo(no);
		setStudentName(name);
		setDateOfBirth(dob);
		setTariffPoints(points);
		noOfStudents++;
	}

	private static Date makeDate(String text) {
		SimpleDateFormat fmt = new SimpleDateFormat("d MMMM yyyy");
		fmt.setLenient(false);
		try {
			return fmt.parse(text);
		} catch (ParseException e) {
			throw new IllegalStateException(e);
		}
	}

	public String getStudentNo() { return studentNo; }
	public void setStudentNo(String no) {
		if (no == null || no.trim().isEmpty())
			throw new IllegalArgumentException("Student number cannot be empty");
		studentNo = no;
	}

	public String getStudentName() { return studentName; }
	public void setStudentName(String name) {
		if (name == null || name.trim().isEmpty())
			throw new IllegalArgumentException("Student name cannot be empty");
		studentName = name;
	}

	public Date getDateOfBirth() { return new Date(dateOfBirth.getTime()); }
	public void setDateOfBirth(Date dob) {
		if (dob == null)
			throw new IllegalArgumentException("Date of birth cannot be null");
		dateOfBirth = new Date(dob.getTime());
	}

	public Integer getTariffPoints() { return tariffPoints; }
	public void setTariffPoints(Integer points) {
		if (points == null || points < 20 || points > 280)
			throw new IllegalArgumentException("Tariff points must be from 20 to 280");
		tariffPoints = points;
	}

	public static int getNoOfStudents() { return noOfStudents; }

	public static void main(String[] args) throws ParseException {
		Student s1 = new Student();
		SimpleDateFormat fmt = new SimpleDateFormat("d MMMM yyyy");
		Student s2 = new Student("S1001", "Alex Smith", fmt.parse("12 May 2005"), 240);
	}
}
