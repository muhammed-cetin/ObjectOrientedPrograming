package interfaceexample;

public class Rectangle implements Polygon {
    @Override
    public void getArea() {
        int length = 6;
        int breadth = 5;
        System.out.println("The area of the rectangle is " + (length * breadth));
    }

    @Override
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}
