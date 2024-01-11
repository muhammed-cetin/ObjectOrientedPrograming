package polymorphism;

class PolygonPoly {
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends PolygonPoly {
    @Override
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends PolygonPoly {
    @Override
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

class PolyMain {
    public static void main(String[] args) {
        PolygonPoly polygonPoly = new PolygonPoly();
        polygonPoly.render();
        Square square = new Square();
        square.render();
        Circle circle = new Circle();
        circle.render();
    }
}
