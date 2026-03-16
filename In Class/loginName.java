import java.util.Scanner;

public class loginName {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter your first and last name, and a number:");
    String in = scn.nextLine();
    
    String firstname = in.substring(0,in.indexOf(' '));
    char initial = in.charAt(in.indexOf(' ')+1);
    char firstnum = in.charAt(in.length()-1);   //no idea what it meant by use the % operator
    
    if (firstname.length() > 6) { 
        firstname = firstname.substring(0,6);   //truncating the name
    }
    
    String loginname = firstname + initial + '_' + firstnum;
    
    System.out.println("Your login name: " + loginname);
  }
}
