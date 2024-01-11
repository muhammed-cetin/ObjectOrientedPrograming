package superkeyword;


class Student {
    Student() {
        System.out.println("I am a student");
    }

    Student(String type) {
        System.out.println("Type: " + type);
    }
}

// super() Kullanarak Yapıcıyı Çağırma
class EngineeringStudent extends Student {
    EngineeringStudent() {

        // super keyword ile üst sınıfın constructor'una ulaşmak.
        super();
        System.out.println("I am an engineering student");
    }
}

// super() Kullanarak Parametreli Yapıcıyı Çağırma
class EngineeringStudent1 extends Student {
    EngineeringStudent1() {
        // super keyword ile üst sınıfın parametreli constructor'una ulaşmak.
        super("engineer");

        System.out.println("I am an engineer");
    }
}

class main2 {
    static int age;

    public static void main(String[] args) {
        EngineeringStudent engStd = new EngineeringStudent();
        System.out.println("");
        EngineeringStudent1 engStd1 = new EngineeringStudent1();
        System.out.println(age);
    }
}
