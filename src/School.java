public class School {
    public static void main(String[] args) {

        Student student = new Student("Adam", "Nowak", 3);
        Teacher teacher = new Teacher("Karol", "Kowalski", 3000);

        student.showInfo();
        teacher.showInfo();


    }
}
