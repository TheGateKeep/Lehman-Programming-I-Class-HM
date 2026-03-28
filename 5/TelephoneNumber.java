import java.util.Scanner;

public class TelephoneNumber {
  static Scanner scn = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Please enter a telephone number using letters :");
    String in = scn.nextLine();
    
    String out = "";
    int s = 7;
    for (int i = 0; i < s; i++) {
        if (i == 3) {
            out += "-";
        }
        if (in.charAt(i) == ' ') {
            s++;
            continue;
        }
        String ch = String.valueOf(in.charAt(i)).toUpperCase();
        switch (ch) {
            case "A","B","C":
                out+= "2";
                break;
            case "D","E","F":
                out+= "3";
                break;
            case "G","H","I":
                out+= "4";
                break;
            case "J","K","L":
                out+= "5";
                break;
            case "M","N","O":
                out+= "6";
                break;
            case "P","Q","R","S":
                out+= "7";
                break;
            case "T","U","V":
                out+= "8";
                break;
            case "W","X","Y","Z":
                out+= "9";
                break;
        }
    }
    System.out.println(out);
  }
}
