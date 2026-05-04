import java.util.Scanner;

public class FinalExamAnswers {
  static Scanner scn = new Scanner(System.in);
  
  public static void main(String[] args) {
    manipulateString();
  }
  
  public static void manipulateString() {
    System.out.println("Enter a sentence:");
    String[] Snt = scn.nextLine().split(" ");
    int lgth = Snt.length-1;
    String[] Switch = new String[lgth+1];
    for(int i = 0; i < lgth+1; i++) {
        Switch[i] = Snt[lgth-i];
        if (i % 2 == 0) {
            Switch[i] = Switch[i].toUpperCase();
        }
        else {
            Switch[i] = Switch[i].toLowerCase();
        }
    }
    String out = "";
    for(int i = 0; i < lgth+1; i++) {
        out += (Switch[i]+" ");
    }
    System.out.println(out);
  }
}
