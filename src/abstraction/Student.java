package abstraction;

public class Student extends Person {
    @Override
    String getName() {
        return "Java";
    }

    @Override
    String getSurname() {
        return "Developer";
    }

    public int getNumber() {
        return super.getNumber();
    }
}