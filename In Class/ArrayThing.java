public class ArrayThing {
  public static void main(String[] args) {
    int[] a = {1,6,17,2,26,62,3,432,14,36};
    System.out.println(  highestVal(a)  );
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
}
