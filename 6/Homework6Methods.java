import java.util.Scanner;
import java.util.Arrays;

public class Homework6Methods {
  Scanner scn = new Scanner(System.in);
  
  public static void main(String[] args) {
    
  }
  
  public static int getMaxOf2Ints(int a, int b) {
    if (a > b) {return a;}
    else {return b;}
  }
  
  public static int getMinOf2Ints(int a, int b) {
    if (a < b) {return a;}
    else {return b;}
  }
  
  public static int getMaxOf3Ints(int a, int b, int c) {
    if (a > b && a > c) {
        return a;
    }
    else {return getMaxOf2Ints(b,c);}
  }
  
  public static int getMedianOf3Ints(int a, int b, int c) {
    if ((a > b && b > c) || (c > b && b > a)) {
        return b;
    }
    else if ((b > a && a > c) || (c > a && a > b)) {
        return a;
    }
    else {return c;}
  }
  
  public static void PrintMinOf3Ints(int a, int b, int c) {
    System.out.print("The min is "+getMinOf2Ints(getMinOf2Ints(a,b),c))
  }
  
  public static int getProdOfAllPositiveInts(int a) {
    if (a <= 0) {return 0;}
    else {
        int out = 1;
        for (int i = 1; i < a; i++) {
            out *= i;
        }
        return out;
    }
  }
  
  public static int getProdOfAllNegativeInts(int a) {
    if (a >= 0) {return 0;}
    else {
        int out = 1;
        for (int i = 1; i < a; i--) {
            out *= i;
        }
        return out;
    }
  }
  
  public static boolean isProdOfAllNegativeIntsNegative(int a) {
    if (getProdOfAllNegativeInts(a) >= 0) {
        return false;
    }
    else {return true;}
  }
  
  public static char getCharAtIndex(String s, int i) {
    if (s.length() - 1 < i) {return '?';}
    else {return s.charAt(i);}
  }
  
  public static int getCountOfCharInString(String s, char c) {
    int out;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)==c) {out++;}
    }
    return out;
  }
  
  public static int getStringReversed(String s) {
    char[] a = new char[s.length()];
    Arrays.fill(a,' ');
    
    for (int i = s.length(); i > 0; i--) {
        
        //continue
    }
    
    return new String(array);
  }
  
  public static int getStringTitleCased(String s) {
    if (s == null || s == "") {return "";}
    else {
        //continue
    }
  }
}
