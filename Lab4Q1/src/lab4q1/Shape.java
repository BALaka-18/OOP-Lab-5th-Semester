/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BALAKA
 */
public class Shape {
    
    private String color = "red";
    
    public Shape() {
        
    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public String getDesc() {
        return "I am a Shape of color " + this.getColor();
    }
    public static void main(String[] args) {
        Shape myShape = new Shape("blue");
        System.out.println(myShape.getDesc());
    }
}
