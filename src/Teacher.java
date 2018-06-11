public class Teacher extends Person{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println( " " + salary);
    }
}
