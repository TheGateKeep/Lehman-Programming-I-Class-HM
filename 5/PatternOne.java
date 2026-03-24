import java.util.Scanner;

public class PatternOne {
  static Scanner scn = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Please enter a number 1...9 :");
    int in = scn.nextInt();
    
    for (int i = 1; i <= in; i++) {
        for (int n = 1; n <= i; n++) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    
  }
}
