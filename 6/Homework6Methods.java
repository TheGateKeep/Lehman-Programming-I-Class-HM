import java.util.Scanner;
import java.util.Arrays;

public class Homework6Methods {
  static Scanner scn = new Scanner(System.in);
  
  public static void main(String[] args) {
    //input system used for testing
    
    System.out.print("Select Method 0-11: ");
    int p = scn.nextInt();
    System.out.println("Grant Input: ");
    
    switch (p) {
        case 0:
            System.out.println(getMaxOf2Ints(scn.nextInt(),scn.nextInt()));
            break;
        case 1:
            System.out.println(getMinOf2Ints(scn.nextInt(),scn.nextInt()));
            break;
        case 2:
            System.out.println(getMaxOf3Ints(scn.nextInt(),scn.nextInt(),scn.nextInt()));
            break;
        case 3:
            System.out.println(getMedianOf3Ints(scn.nextInt(),scn.nextInt(),scn.nextInt()));
            break;
        case 4:
            PrintMinOf3Ints(scn.nextInt(),scn.nextInt(),scn.nextInt());
            break;
        case 5:
            System.out.println(getProdOfAllPositiveInts(scn.nextInt()));
            break;
        case 6:
            System.out.println(getProdOfAllNegativeInts(scn.nextInt()));
            break;
        case 7:
            System.out.println(isProdOfAllNegativeIntsNegative(scn.nextInt()));
            break;
        case 8:
            String fix1 = scn.nextLine();
            //was scanning for the the next line before input, this is here to skip that line
            System.out.println(getCharAtIndex(scn.nextLine(),scn.nextInt()));
            break;
        case 9:
            String fix2 = scn.nextLine();
            //ditto
            System.out.println(getCountOfCharInString(scn.nextLine(),scn.next().charAt(0)));
            break;
        case 10:
            String fix3 = scn.nextLine();
            //ditto
            System.out.println(getStringReversed(scn.nextLine()));
            break;
        case 11:
            String fix4 = scn.nextLine();
            //ditto
            System.out.println(getStringTitleCased(scn.nextLine()));
            break;
        default:
            System.out.println("Error: Beyond Method List");
    }
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
    System.out.print("The min is "+getMinOf2Ints(getMinOf2Ints(a,b),c));
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
    if (a < 0) {
        int out = 1;
        for (int i = -2; i > a; i--) {
            out *= i;
        }
        return out;
    }
    else {return 0;}
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
    int out = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == c) {out++;}
    }
    return out;
  }
  
  public static String getStringReversed(String s) {
    char[] a = new char[s.length()];
    Arrays.fill(a,' ');
    
    for (int i = s.length()-1; i >= 0; i--) {
        a[s.length()-i-1] = s.charAt(i);
    }
    
    return new String(a);
  }
  
  public static String getStringTitleCased(String s) {
    if (s == null || s == "" || s.length() == 0) {return "";}
    else {
        char[] a = new char[s.length()];
        for (int i = 1; i < s.length(); i++) {
            a[i] = s.charAt(i);
            a[i] = Character.toLowerCase(a[i]);
            if (a[i-1] == ' ') {
                a[i] = Character.toUpperCase(a[i]);
            }
        }
        a[0] = s.charAt(0);
        a[0] = Character.toUpperCase(a[0]);
        
        return new String(a);
    }
  }
}
