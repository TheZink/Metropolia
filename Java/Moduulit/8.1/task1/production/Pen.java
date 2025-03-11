package task1.production;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color color = Color.RED;
    private boolean cap = true;
    
    public Pen(){}

    public Pen(Pen.Color color) {
        this.color = color;
    }

    public void changeColor(Pen.Color color) {
        this.color = color;
    }

    public String draw() {
        if (cap) {
            return "";
        } else {
            return "Drawing " + color.toString();
        }
    }

    public void capOff() {
        cap = false;
    }

    public void capOn() {
        cap = true;
    }
}
