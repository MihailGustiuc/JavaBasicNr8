package task3;

public class Cube extends ThreeDimensionalShape {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return 6 * sideLength * sideLength;
    }

    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
