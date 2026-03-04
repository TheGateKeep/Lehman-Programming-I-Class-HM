import java.util.Scanner;

public class CopenhagenTransit {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter zone number :");
    int zone = scn.nextInt();
    System.out.println("Enter adult or child :");
    String age = scn.nextLine();
    age = scn.nextLine();
    
    double fare = 0;
    
    if (zone <= 2) {
        if (age.equals("adult")) {
            fare = 23;
        }
        else if (age.equals("child")) {
            fare = 11.5;
        }
    }
    else if (zone == 3) {
        if (age.equals("adult")) {
            fare = 34.5;
        }
        else if (age.equals("child")) {
            fare = 23;
        }
    }
    else if (zone == 4) {
        if (age.equals("adult")) {
            fare = 46;
        }
        else if (age.equals("child")) {
            fare = 23;
        }
    }
    else {
        fare = -1;
    }
    
    System.out.println("The fare for "+age+" to zone number "+zone+" is $"+fare+".");
  }
}
