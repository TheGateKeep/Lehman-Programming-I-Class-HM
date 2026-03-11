import java.util.Scanner;
import java.util.Arrays;

public class Words {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Enter 4 words:");
    String in = scn.nextLine();
    
    int[] wordBounds = new int[8]; 
    wordBounds[0] = 0;              //sets first start to 0
    wordBounds[7] = in.length()-1;  //sets last to end of string
    
    int space = 0;                  //tracks which space it's found
    for (int j = 0; j < in.length(); j++) {
        if (in.charAt(j) == ' ') {
            
            //sets var for start and ends of words based on spaces found
            
            wordBounds[(2*space)+1] = j - 1;
            wordBounds[(2*space)+2] = j + 1;
            space++;
        }
    }
    
    String[] words = new String[4];
    for (int s = 0; s < 4; s++) {
        words[s] = in.substring(wordBounds[s*2],wordBounds[s*2+1]+1);
    }
    
    int[][] vowels = {{-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1}};
    boolean[] vowelFound = {false,false,false,false,false};
    /*
        int[a][b]
        a is which word is being looked at, 0-3
        b is which vowel, order a e i o u for 0-4
    */
    int vow = 0;
    boolean found = false;
    for (int k = 0; k < 4; k++) {                                   //k is each word
        for (int m = 0; m < words[k].length(); m++) {    //m indexes through each letter
            switch (words[k].charAt(m)) {
                case 'a':
                    vow = 0;
                    found = true;
                    break;
                case 'e':
                    vow = 1;
                    found = true;
                    break;
                case 'i':
                    vow = 2;
                    found = true;
                    break;
                case 'o':
                    vow = 3;
                    found = true;
                    break;
                case 'u':
                    vow = 4;
                    found = true;
                    break;
                default:
                    break;
            }
            if (vowelFound[vow] == false && found) {
                        vowels[k][vow] = m;
                        vowelFound[vow] = true;
            }
            found = false;
            vow = 0;
        }
        Arrays.fill(vowelFound,false);
    }
    
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
