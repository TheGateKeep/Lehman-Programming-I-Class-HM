import java.util.Scanner;

public class DateConverter {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    enum days {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
    enum months {January,February,March,April,May,June,July,August,September,October,November,December};
    
    System.out.println("Enter 4 integers representing dayNumber monthNumber date year:");
    int day = scn.nextInt();
    int month = scn.nextInt();
    int date = scn.nextInt();
    int year = scn.nextInt();
    
    if (day > 7 || day < 1 ) {
        System.out.print("Invalid day number: "+day+", please enter a number from 1..7.");
        return;
    }
    if (month > 12 || month < 1 ) {
        System.out.print("Invalid month number: "+months.values()[month-1]+", please enter a number from 1..12.");
        return;
    }
    if (date > 31 || date < 1 ) {
        System.out.print("Invalid date number: "+date+", please enter a number from 1..31.");
        return;
    }
    if ( (month == 2 && date > 29)
    || ( month <=  7 && date > (30+(month % 2)) )
    || ( month > 7 && date > (30+((month+1) % 2)) )
    ) {
        System.out.print("Invalid date: "+months.values()[month-1]+", does not have "+date+" days, please enter a valid date.");
        return;
    }
    
    if (month == 2 && date == 29) {
        System.out.print("Invalid date: "+months.values()[month-1]+", does not have "+date+" days, please enter a valid date.");
        return;
    }
  }
}
