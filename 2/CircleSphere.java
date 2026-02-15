import java.util.Scanner;

public class CircleSphere {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter radius:");
    double rad = scn.nextDouble();
    
    double circCircum = Math.PI * 2 * rad;
    double circArea = Math.PI * Math.pow(rad,2);
    double sphereArea = 4 * Math.PI * Math.pow(rad,2);
    double sphereVol = (4.0/3.0) * Math.PI * Math.pow(rad,3);
    
    System.out.println("Circle Circumference = " + circCircum);
    System.out.println("Circle Area = " + circArea);
    System.out.println("Sphere Area = " + sphereArea);
    System.out.println("Sphere Volume = " + sphereVol);
    }
}
