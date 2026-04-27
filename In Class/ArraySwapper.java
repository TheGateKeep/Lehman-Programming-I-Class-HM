import java.util.Scanner;

public class ArraySwapper {
  public static void main(String[] args) {
    int[] arg = arrayInput("A");
    int[] barg = arrayInput("B");
    int temp;
    for (int i = 0; i < arg.length; i++) {
        temp = barg[i];
        barg[i] = arg[i];
        arg[i] = temp;
    }
    
    System.out.println("array A");
    for(int i = 0; i < arg.length; i++) {
        System.out.print(arg[i]+" ");
    }
    System.out.println(0);
    System.out.println("array B");
    for(int i = 0; i < barg.length; i++) {
        System.out.print(barg[i]+" ");
    }
    
  }
  
  static Scanner scn = new Scanner(System.in);
  public static int[] arrayInput(String name) {
    System.out.print("Array "+name+" length: ");
    int l = scn.nextInt();
    int[] out = new int[l];
    
    System.out.println("Array values: ");
    for(int i = 0; i < l; i++) {
        out[i] = scn.nextInt();
    }
    return out;
  }
}
