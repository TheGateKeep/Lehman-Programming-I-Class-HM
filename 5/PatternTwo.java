import java.util.Scanner;

public class PatternTwo {
  static Scanner scn = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Please enter a number 1...9 :");
    int in = scn.nextInt();
    
    for (int i = 1; i <= in; i++) {
        for (int j = 0; j < ((2*in+1)-(2*i)-1); j++) {
            System.out.print(" ");
        }
        for (int n = i; n > 0; n--) {
            System.out.print(" "+n);
        }
        System.out.println();
    }
  }
}
