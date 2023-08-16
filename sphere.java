 //design  a class named sphere with three instance variables i.e r,a,v(type double) and the following member methods to carry out the specified task:
 //

import java.util.Scanner;

public class sphere {
    private double r; // declaring instance variables
    private double a; 
    private double v; 
    
    public sphere(double radius) {
        r = radius; //initializiing methods
        calculateArea();
        calculateVolume();
    }
    
    private void calculateArea() {
        a = 4 * Math.PI * r * r;
    }
    
    private void calculateVolume() {
        v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
    
    public double getRadius() {
        return r;
    }
    
    public double getSurfaceArea() {
        return a;
    }
    
    public double getVolume() {
        return v;
    }
    
    public void setRadius(double radius) {
        r = radius;
        calculateArea();
        calculateVolume();
    }
    
    // Method to get user input for radius
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        setRadius(radius);
    }
    
    // Method to calculate area of the sphere
   
    
    // Method to display calculated values
    public void dispData() {
        

        System.out.println("Radius: " + r);
        System.out.println("Surface Area: " + a);
        System.out.println("Volume: " + v);
    }
    
    public static void main(String[] args) {
        sphere sphere = new sphere(0); // Initialize with a default radius
        
        sphere.getData(); // Get user input for radius
        sphere.calculateArea(); // Calculate area based on user input
        sphere.calculateVolume(); // Calculate volume based on user input
        sphere.dispData(); // Display calculated values
    }
}
