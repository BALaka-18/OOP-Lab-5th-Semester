/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BALAKA
 */
public class Rectangle extends Shape {
    
    private double length = 0;
    private double breadth = 0;
    
    public Rectangle() {
        
    }
    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    // override
    public String getDesc() {
        return "I am a Rectangle of color " + this.getColor();
    }
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle("blue",10,20);
        System.out.println(myRectangle.getDesc());
    }
}
