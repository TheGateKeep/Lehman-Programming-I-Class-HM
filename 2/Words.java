import java.util.Scanner;

public class Words {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter 4 words:");
    String in = scn.nextLine();
    
    boolean t = true;
    int[] wordBounds = new int[8];
    wordBounds[0] = 0;
    for (int j = 0; j < 4; j++) {
        for (int i = 0; t == false; i++) {
            if (in.charAt(i+wordBounds[j*2]) == ' ') {
                t = true;
                wordBounds[(2*j)+1] = i+wordBounds[j*2] - 1;
                if (2*j+2 < 8) {
                    wordBounds[(2*j)+2] = i+wordBounds[j*2] + 1;
                }
            }
        }
        t = false;
    }
    for (int i = 0; i < 8; i++) {
        System.out.println(wordBounds[i]);
    }
    }
}
