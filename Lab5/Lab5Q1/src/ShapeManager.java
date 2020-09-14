/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BALAKA
 */
public class ShapeManager {
    // NOT ALLOWED :  Shape myshape = new Shape();  -->  Abstract classes can't be instantiated.
    public static void main(String[] args) {
        Triangle myTri = new Triangle(4,5);
        Triangle yourTri = new Triangle("red",5,6);
        System.out.println(myTri.show());
        
        System.out.println(myTri.compareTo(yourTri));
    }
}
