package task2;

public class Parallelogram {
    private int length;
    private int width;

    public Parallelogram(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Parallelogram(int sideLength) {
        this.length = sideLength;
        this.width = sideLength;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public int calculatePerimeter(int sideLength) {
        return 2 * (sideLength + width);
    }

    public int calculateArea(int sideLength) {
        return sideLength * width;
    }
}
