public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeType, String shapeColor, double width, double height) {
        super(shapeType, shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString(){
        return getShapeType() +": "+calculateArea() + " " + getShapeColor();
    }
}