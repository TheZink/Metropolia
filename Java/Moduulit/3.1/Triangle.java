public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String shapeType, String shapeColor, double base, double height) {
        super(shapeType, shapeColor);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString(){
        return getShapeType() +": "+calculateArea() + ". " + getShapeColor();
    }
}