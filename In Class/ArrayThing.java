import java.util.Scanner;

public class ArrayThing {
  public static void main(String[] args) {
    int[] a = arrayInput();
    //System.out.println(  highestVal(a)  );
    a = sort(a);
    
    for(int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
    }
  }
  
  public static int highestVal(int[] arr) {
    int highest = arr[0];
    
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] > highest) {
            highest = arr[i];
        }
    }
    
    return highest;
  }
  
  public static int[] sort(int[] arg) {
    int temp;
    int[] arr = arg;
    while(!(isSorted(arr))) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }
    return arr;
  }
  
  public static Boolean isSorted(int[] arr) {
    for(int i = 1; i < arr.length; i++) {
        if(arr[i] < arr[i-1]) {
            return false;
        }
    }
    return true;
  }
  
  static Scanner scn = new Scanner(System.in);
  public static int[] arrayInput() {
    System.out.print("Array length: ");
    int l = scn.nextInt();
    int[] out = new int[l];
    
    System.out.println("Array values: ");
    for(int i = 0; i < l; i++) {
        out[i] = scn.nextInt();
    }
    return out;
  }
}
