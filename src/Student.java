public class Student extends Person {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student(String firstName, String lastName, int year) {
        super(firstName, lastName);
        this.year = year;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" " + year);
    }
}

