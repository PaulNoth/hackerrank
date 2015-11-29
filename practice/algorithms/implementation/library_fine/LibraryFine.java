import java.util.Scanner;

public class LibraryFine
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int actualDay = stdin.nextInt();
        int actualMonth = stdin.nextInt();
        int actualYear = stdin.nextInt();
        int expectedDay = stdin.nextInt();
        int expectedMonth = stdin.nextInt();
        int expectedYear = stdin.nextInt();

        int yearDiff = actualYear - expectedYear;
        int monthDiff = actualMonth - expectedMonth;
        int dayDiff = actualDay - expectedDay;

        System.out.println(fee(yearDiff, monthDiff, dayDiff));
    }

    private static int fee(int year, int month, int day)
    {
        if(year > 0) return 10000;
        if(year == 0 && month > 0) return month * 500;
        if(year == 0 && month == 0 && day > 0) return day * 15;
        return 0;
    }
}
