package encapsulation;

public class MainEnc {
    public static void main(String[] args) {

        Encapsulation enc = new Encapsulation();
        enc.setAge(24);
        enc.setName("Java");
        enc.setSurname("Developer");

        System.out.println("Age:" + enc.getAge() + " / " + "Name:" + enc.getName() + " / " + "Surname: " + enc.getSurname());

    }
}
