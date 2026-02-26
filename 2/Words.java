import java.util.Scanner;
import java.util.Arrays;

public class Words {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter 4 words:");
    String in = scn.nextLine();
    
    boolean t = true;
    int[] wordBounds = new int[8]; 
    wordBounds[0] = 0;              //sets first start to 0
    wordBounds[7] = in.length()-1;  //sets last to end of string
    /*
        Each index is meant to be the char index of the start or end of a wordBounds
        this is to then know where to search to / from for
        8 values, 4 for the starts, 4 for the ends
    */
    for (int j = -1; j < 3; j++) {   //j goes from 0 - 4, being each word
        for (int i = 0; t == false; i++) {  //i goes through each letter in the word to find the end
            if (in.charAt(i+wordBounds[j*2]) == ' ') {
                t = true;
                wordBounds[(2*j)+1] = i+wordBounds[j*2] - 1;
                wordBounds[(2*j)+2] = i+wordBounds[j*2] + 1;
            }
        }
        t = false;
    }
    
    String word1 = in.substring(wordBounds[0],wordBounds[1]+1);
    String word2 = in.substring(wordBounds[2],wordBounds[3]+1);
    String word3 = in.substring(wordBounds[4],wordBounds[5]+1);
    String word4 = in.substring(wordBounds[6],wordBounds[7]+1);
    
    int[][] vowels = {{-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1}};
    boolean[] vowelFound = {false,false,false,false,false};
    /*
        int[a][b]
        a is which word is being looked at, 0-3
        b is which vowel, order a e i o u for 0-4
    */
    
    for (int k = 0; k < 4; k++) {                                   //k is each word
        for (int m = wordBounds[k]; m <= wordBounds[k+1]; m++) {    //m indexes through each letter
            switch (in.charAt(m)) {
                case 'a':
                    if (vowelFound[0] == false) {
                        vowels[k][0] = m - wordBounds[k];
                        vowelFound[0] = true;
                    }
                    break;
                case 'e':
                    if (vowelFound[1] == false) {
                        vowels[k][1] = m - wordBounds[k];
                        vowelFound[1] = true;
                    }
                    break;
                case 'i':
                    if (vowelFound[2] == false) {
                        vowels[k][2] = m - wordBounds[k];
                        vowelFound[2] = true;
                    }
                    break;
                case 'o':
                    if (vowelFound[3] == false) {
                        vowels[k][3] = m - wordBounds[k];
                        vowelFound[3] = true;
                    }
                    break;
                case 'u':
                    if (vowelFound[4] == false) {
                        vowels[k][4] = m - wordBounds[k];
                        vowelFound[4] = true;
                    }
                    break;
                default:
                    break;
            }
        }
        Arrays.fill(vowelFound,false);
    }
    
    String[] words = {word1,word2,word3,word4};
    
    for (int p = 0; p < 4; p++) {
        System.out.println(
            "Word "+(p+1)+" = "+words[p]+
            " Length = "+(words[p].length())+
            " position of vowels: 'a' = "+vowels[p][0]+
            ", 'e' = "+vowels[p][1]+
            ", 'i' = "+vowels[p][2]+
            ", 'o' = "+vowels[p][3]+
            ", 'u' = "+vowels[p][4]);
    }
  }
}
