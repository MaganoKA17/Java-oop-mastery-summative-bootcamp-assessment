package oopmastery;

public class Question05_Rectangle {

    private double width;
    private double height;

    public Question05_Rectangle(
            double width,
            double height
    ) {
        // TODO:
        // Store width and height
        this.width = width;
        this.height = height;
    }

    public double area() {
        // TODO:
        // Return width × height
        return this.width * this.height;
    }

    public double perimeter() {
        // TODO:
        // Return:
        // 2 × (width + height)
        return 2 * (this.width + this.height);
    }
}