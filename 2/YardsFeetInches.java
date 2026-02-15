import java.util.Scanner;

public class YardsFeetInches {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter number of inches:");
    int inch = scn.nextInt();
    
    int yard = inch / (12 * 3);
    inch -= yard * 12 * 3;
    
    int feet = inch / 12;
    inch -= feet * 12;
    
    System.out.println(yard + " yards, " + feet + " feet, and " + inch +" inches.");
    }
}
