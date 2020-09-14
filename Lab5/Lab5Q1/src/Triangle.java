/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BALAKA
 */

// Relation between Triangle and Shape
public class Triangle extends ShapeNew implements Comparable{
    private int base = 0;
    private int height = 0;
    
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    public Triangle(String color, int base, int height) {
        this.setColor(color);
        this.base = base;
        this.height = height;
    }
    
   public double getArea() {
       return 0.5*this.base*this.height;
   }
   public String show() {
       return "I am a Triangle of color : " + this.getColor();
   }
   // Object o is the other Triangle
   public int compareTo(Object o) {
       int result = 0;
       if (this.getArea() > ((Triangle)o).getArea())
           result = 1;
       return result;
   }
}
