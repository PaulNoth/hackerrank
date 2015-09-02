import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String input = stdin.nextLine();
        int hours = Integer.parseInt(input.substring(0, input.indexOf(':')));
        int minutes = Integer.parseInt(input.substring(input.indexOf(':') + 1, input.lastIndexOf(':')));
        int seconds = Integer.parseInt(input.substring(input.lastIndexOf(':') + 1, input.lastIndexOf(':') + 3));
        int newHours;
        if(hours == 12) {
            newHours = 0;
        } else {
            newHours = hours;
        }
        int shift;
        if(input.toLowerCase().contains("pm")) {
            shift = 12;
        } else {
            shift = 0;
        }
        System.out.println(String.format("%02d:%02d:%02d", (newHours + shift), minutes, seconds));
    }
}
