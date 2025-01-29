public class Shape {
    private String shapeType;
    private String shapeColor;

    public Shape(String shapeType, String shapeColor){
        this.shapeType = shapeType;
        this.shapeColor = shapeColor;
    }
    public double calculateArea() {
        return 0;
    }
    String getShapeType() { return shapeType; }
    String getShapeColor() { return shapeColor; }
}
