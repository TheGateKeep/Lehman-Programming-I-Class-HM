import java.util.Scanner;

public class DistanceFormula {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Coordinates for P1" + "\n" + "Enter X1:");
    double x1 = scn.nextDouble();
    System.out.println("Enter Y1:");
    double y1 = scn.nextDouble();
    System.out.println("Coordinates for P2" + "\n" + "Enter X2:");
    double x2 = scn.nextDouble();
    System.out.println("Enter Y2:");
    double y2 = scn.nextDouble();
    
    double difx = Math.pow(x2-x1,2);
    double dify = Math.pow(y2-y1,2);
    double dist = Math.sqrt(difx+dify);
    
    System.out.println("Distance between P1 and P2 = " + dist);
    }
}
