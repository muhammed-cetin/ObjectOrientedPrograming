package inheritance;

public class Animal {

    private String name;

    public void eat(){
        System.out.println("I can eat");
    }

    public void sleep(){
        System.out.println("I can sleep");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
