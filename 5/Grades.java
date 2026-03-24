import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Grades {
  static Scanner scn = new Scanner(System.in);
  static ArrayList<Integer> grades = new ArrayList<Integer>();
  static String[] gradeLetters = {"A","A","B+","B","B-","C+","C","C-","D","F"};
  static int[] gradeAmounts = new int[10];
  
  public static void main(String[] args) {
    System.out.println("Enter a grade:");
    
    int in = 0;
    while (in != -1) {
        in = scn.nextInt();
        if (in >= 0 && in <= 100) {
            grades.add(in);
        }
    }
    System.out.println("Total number of grades = "+grades.size());
    
    Arrays.fill(gradeAmounts,0);
    for (int i = 0; i < grades.size(); i++) {
        int g = grades.get(i);
        if (g >= 93) {
            gradeAmounts[0]++;
        }
        else if (g >= 90) {
            gradeAmounts[1]++;
        }
        else if (g >= 87) {
            gradeAmounts[2]++;
        }
        else if (g >= 83) {
            gradeAmounts[3]++;
        }
        else if (g >= 80) {
            gradeAmounts[4]++;
        }
        else if (g >= 77) {
            gradeAmounts[5]++;
        }
        else if (g >= 73) {
            gradeAmounts[6]++;
        }
        else if (g >= 70) {
            gradeAmounts[7]++;
        }
        else if (g >= 60) {
            gradeAmounts[8]++;
        }
        else {
            gradeAmounts[9]++;
        }
    }
    
    for (int i = 0; i < 10; i++) {
        System.out.println("Number of "+gradeLetters[i]+"'s = "+gradeAmounts[i]);
    }
  }
}
