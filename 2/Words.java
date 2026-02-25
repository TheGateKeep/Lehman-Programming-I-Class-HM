import java.util.Scanner;

public class Words {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter 4 words:");
    String in = scn.nextLine();
    
    boolean t = true;
    int[] wordBounds = new int[9];  //just ignore the 9th value
    wordBounds[0] = 0;              //sets first start to 0
    wordBounds[7] = in.length()-1;  //sets last to end of string
    /*
        Each index is meant to be the char index of the start or end of a wordBounds
        this is to then know where to search to / from for
        8 values, 4 for the starts, 4 for the ends
    */
    for (int j = -1; j < 3; j++) {   //j goes from 0 - 4, being each word
        for (int i = 0; t == false; i++) {  //i goes through each letter in the word to find the end
            if (in.charAt(i+wordBounds[j*2]) == ' ') { //9th value prevents this from going out of bounds
                t = true;
                wordBounds[(2*j)+1] = i+wordBounds[j*2] - 1;
                wordBounds[(2*j)+2] = i+wordBounds[j*2] + 1;
            }
        }
        t = false;
    }
    for (int i = 0; i < 8; i++) {
        System.out.println(wordBounds[i]);
    }
}
}
