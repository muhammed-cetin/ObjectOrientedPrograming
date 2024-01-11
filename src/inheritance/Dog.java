package inheritance;

public class Dog extends Animal {

    // display methodu içerisindeki name değişkeni üst sınıftan genel name değişkenidir.
    public void display() {
        System.out.println("My name is:" + getName());
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        // superclass dan override edilen methodunu geçeriz kıldık.
        System.out.println("sleeps in dogs");
    }
}
