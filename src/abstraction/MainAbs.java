package abstraction;

public class MainAbs {

    public static void main(String[] args) {
        Student std = new Student();
        System.out.println("Student Name: " + std.getName()
                + "\nStudent Surname: " + std.getSurname()
                + "\nStudent Number: " + std.getNumber());
    }
}
