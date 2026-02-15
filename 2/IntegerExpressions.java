import java.util.Scanner;

public class IntegerExpressions {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter firstInt: ");
    int firstInt = scn.nextInt();
    System.out.println("Enter secondInt: ");
    int secondInt = scn.nextInt();
    System.out.println("Enter thirdInt: ");
    int thirdInt = scn.nextInt();
    
    int firstResult = (firstInt + secondInt) / thirdInt;
    int secondResult = (secondInt * thirdInt) / (secondInt + firstInt);
    int thirdResult = (firstInt * thirdInt) % secondInt;
    
    System.out.println("First Result: " + firstResult);
    System.out.println("Second Result: " + secondResult);
    System.out.println("Third Result: " + firstResult);
  }
}
