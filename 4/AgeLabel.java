import java.util.Scanner;

public class AgeLabel {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.print("Enter an age in number of days : ");
    int years = scn.nextInt()/365;
    String desc = "";
    
    if (years <= 1) {desc = "an infant";}
    else if (years <= 3) {desc = "a toddler";}
    else if (years <= 12) {desc = "a child";}
    else if (years <= 19) {desc = "a teenager";}
    else if (years <= 21) {desc = "a young adult";}
    else if (years <= 50) {desc = "an adult";}
    else if (years <= 65) {desc = "middle aged";}
    else if (years > 65) {desc = "a senior citizen";}
    
    
    System.out.print("You are "+desc);
  }
}
