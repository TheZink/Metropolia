package controller;

import model.petModel;

public class petContr {
    private petModel model = new petModel();

    public void movePet(double x, double y) {
        model.setPetX(x);
        model.setPetY(y);
    }

    public void setMouse(double x, double y) {
        model.setMouseX(x);
        model.setMouseY(y);
    }

    public double getX() {
        return model.getPetX();
    }
    
    public double getY() {
        return model.getPetY();
    }

    public double getMouseX() {
        return model.getMouseX();
    }

    public double getMouseY() {
        return model.getMouseY();
    }
}
