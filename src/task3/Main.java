package task3;

public class Main  {

    public static void main(String[] args) {
        Circle c = new Circle(8);
        System.out.println("Area of circle: " + c.calculateArea());

        Square s = new Square(4);
        System.out.println("Area of square: " + s.calculateArea());

        Sphere sp = new Sphere(8);
        System.out.println("Area of sphere: " + sp.calculateArea());
        System.out.println("Volume of sphere: " + sp.calculateVolume());

        Cube cu = new Cube(10);
        System.out.println("Area of cube: " + cu.calculateArea());
        System.out.println("Volume of cube: " + cu.calculateVolume());

    }
}
