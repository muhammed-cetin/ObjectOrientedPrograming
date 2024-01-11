package superkeyword;


class Person {
    public void display() {
        System.out.println("I am a person");
    }
}

class Emplyoee extends Person {
    @Override
    public void display() {
        System.out.println("I am an employee");
    }

    /*
     * Hem üst sınıfta hem de alt sınıfta aynı ada sahip yöntemler tanımlanmışsa, alt sınıftaki yöntem,
     * üst sınıftaki yöntemi geçersiz kılar. Buna Method overriding(yöntem geçersiz kılma) denir.
     * */
    public void printMessage() {
        display();
    }


    // Peki ya üst sınıfın geçersiz kılınan yönteminin çağrılması gerekiyorsa?
    public void printMessageTwo() {
        display();
        // super keyword ile geçersiz kılınan method çağrıldı.
        super.display();
    }
}

class main {
    public static void main(String[] args) {
        Emplyoee emp1 = new Emplyoee();
        System.out.print("Method overriding:");
        emp1.printMessage();
        System.out.println("");

        System.out.println("Super to Call Superclass Method:");
        emp1.printMessageTwo();
    }
}

