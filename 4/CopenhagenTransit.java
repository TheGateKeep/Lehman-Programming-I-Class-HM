import java.util.Scanner;

public class CopenhagenTransit {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter zone number :");
    int zone = scn.nextInt();
    System.out.println("Enter adult or child :");
    String age = scn.nextLine();
    age = scn.nextLine();
    
    double fare = -1;     //defaults to -1
    
    if (age.equals("adult")) {
        if (zone <= 2) {  //if statement for all below 3, so can't be used in switch
            fare = 23;
        }
        switch (zone) {
            case 3:
                fare = 34.5;
                break;
            case 4:
                fare = 46;
                break;
        }
    }
    else if (age.equals("child")) {
        if (zone <= 2) {  //ditto of line 16
            fare = 11.5;
        }
        switch (zone) {
            case 3:
                fare = 23;
                break;
            case 4:
                fare = 23;
                break;
        }
    }
    
    System.out.println("The fare for "+age+" to zone number "+zone+" is $"+fare+".");
  }
}
