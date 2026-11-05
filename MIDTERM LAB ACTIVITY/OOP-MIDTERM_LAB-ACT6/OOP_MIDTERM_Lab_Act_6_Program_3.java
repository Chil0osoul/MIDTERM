class Professor {
    private final String name;
    private final double salary;

    Professor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }
}

class Deans extends Professor {
    private final String department;

    Deans(String name, String department, double salary) {
        super(name, salary);
        this.department = department;
    }

    String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Status\n"
                + "Rank: Dean\n"
                + "Name: " + getName() + "\n"
                + "Department: " + department + "\n"
                + "Salary: " + getSalary();
    }
}

class Executive extends Deans {
    Executive(String name, String department, double salary) {
        super(name, department, salary);
    }

    @Override
    public String toString() {
        return "Status\n"
            + "Rank: Executive\n"
            + "Name: " + getName() + "\n"
            + "Department: " + getDepartment() + "\n"
            + "Salary: " + getSalary();
    }
}

class OOP_MIDTERM_Lab_Act_6_Program_3 {
    public static void main(String[] args) {
        Deans dean = new Deans("John Cena", "English", 32050);
        Executive executive = new Executive("Ronald Mcdonald", "Computer Science", 42000);

        System.out.println(dean);
        System.out.println("---------------------------------");
        System.out.println(executive);
    }
}
