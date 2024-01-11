package inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        Dog dog = new Dog();

        // superclass erişim alanı
        dog.setName("Kuku");
        dog.display();

        // superclass methodunu çağırıyoruz ancak alt sınıfın nesnesini kullanıyoruz.
        //dog.eat();

        // superclass methodunu çağırıyoruz ancak alt sınıfın bilgilerini kullanıyoruz.
        //dog.sleep();
    }
}
