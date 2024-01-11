package interfaceexample;

public interface Polygon {

    void getArea();

    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}
