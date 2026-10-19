/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w01s03_41425007;

/**
 *
 * @author icisi
 */
// Test driver program for the Circle class
public class TestCircle {// SAve as "TestCircle.java"
    public static void main(String[] args){//Execution entry point
        //Construct an instance of the Circle class called c1
        
        Circle c1 =new Circle(2.0, "blue");//Use 3rd constructor
        c1.radius = 10;// YANG DI TAMBAHIN
        System.out.println("Radius is " + c1.getRadius()
                + " Color is " + c1.getColor()
                + " Area is " + c1.getArea()
      
        

        // Construct another instance of the Circle class called c2
        Circle c2 = new Circle(2.0);             // Use 2nd constructor
        System.out.println("Radius is " + c2.getRadius()
                + " Color is" + c2.getColor()
                + " Area is " + c2.getArea());

        // Construct yet another instance of the Circle class called c3
        Circle c3 = new Circle();                // Use 1st constructor
        System.out.println("Radius is " + c3.getRadius()
                + " Color is " + c3.getColor()
                + " Area is " + c3.getArea());
        
}
} 