package model;

public class petModel {
    private double xPet;
    private double yPet;
    private double xMouse;
    private double yMouse;

    public void setPetX(double xPet) {
        this.xPet = xPet;
    }

    public void setPetY(double yPet) {
        this.yPet = yPet;
    }

    public void setMouseX(double xMouse) {
        this.xMouse = xMouse;
    }

    public void setMouseY(double yMouse) {
        this.yMouse = yMouse;
    }

    public double getPetX() {
        return xPet;
    }

    public double getPetY() {
        return yPet;
    }

    public double getMouseX() {
        return xMouse;
    }

    public double getMouseY() {
        return yMouse;
    }
}
