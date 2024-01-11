package abstraction;

public abstract class Person {
    private String name;
    private String surname;
    private int number = 1;

    abstract String getName();

    abstract String getSurname();

    public int getNumber() {
        return this.number;
    }
}
