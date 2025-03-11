package task1.production;

public class Pen {
    private Color color;
    private boolean cap = true;

    public enum Color {
        RED, GREEN, BLUE
    }

    public Pen(){}

    public Pen(Pen.Color color) {
        this.color = color;
    }

    public void changeColor(Pen.Color color) {
        this.color = color;
    }

    public String draw() {
        if (cap) {
            return " ";
        } else {
            return "Drawing " + color.toString().toLowerCase();
        }
    }

    public void capOff() {
        cap = false;
    }

    public void capOn() {
        cap = true;
    }





}
