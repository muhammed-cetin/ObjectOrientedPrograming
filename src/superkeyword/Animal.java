package superkeyword;

class Animal {
    public String type = "animal";
}

class Dog extends Animal {
    public String type = "mammal";

    /*
     * Üst sınıf ve alt sınıf aynı isimde niteliklere(değişken) sahip olabilir.
     * super keyword'unu üst sınıfın niteliğine erişmek için kullanırız.
     */
    public void printType(){
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

class main1{
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.printType();
    }
}
