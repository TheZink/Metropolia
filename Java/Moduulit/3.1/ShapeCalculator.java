import java.util.HashMap;

public class ShapeCalculator {
    
    public static void main(String[] args) {
        HashMap<String, Shape> result = new HashMap<>();
                
        result.put("Circle", new Circle("Circle","Blue",20));
        result.put("Rectangle", new Rectangle("Rectangle","Red",10,10));
        result.put("Triangle", new Triangle("Triangle","Yellow",20,20));


        for (String item: result.keySet()) {
            Shape shape = result.get(item);
            System.out.println(shape);
        }
    }
}
