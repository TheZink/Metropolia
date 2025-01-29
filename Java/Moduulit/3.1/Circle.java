public class Circle extends Shape {
    private double radius;

    public Circle(String shapeType, String shapeColor, double radius) {
        super(shapeType, shapeColor);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return getShapeType() +": "+calculateArea() + " " + getShapeColor();
    }
}