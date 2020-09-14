/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BALAKA
 */
public abstract class ShapeNew {
    // DEFAULT : package --> means avilable to only the package you're working in.
    // attributes should be private
    private String color = "blue";
    
    public String getColor() {
        return this.color;
    }
    // Available only to Children : protected --> means available only to the same family.
    protected boolean setColor(String color) {
        this.color = color;
        return true;
    }
    // Methods should be public
    // Declare as abstract for implementation by Children and not by default.
    public abstract double getArea();
    public abstract String show();
}
