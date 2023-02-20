package task2;


public class Main {

    public static void main(String[] args) {
        Parallelogram p1 = new Parallelogram(5, 10);
        System.out.println("p1 perimeter: " + p1.calculatePerimeter());
        System.out.println("p1 area: " + p1.calculateArea());

        Parallelogram p2 = new Parallelogram(7);
        System.out.println("p2 perimeter: " + p2.calculatePerimeter());
        System.out.println("p2 area: " + p2.calculateArea());

    }
}
