import java.util.*;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        int totalLiked = 0;
        int dayStartPeople = 5;
        for(int i = 0; i < n; i++) {
            int dayLiked = dayStartPeople / 2;
            int received = dayLiked * 3;
            totalLiked += dayLiked;
            dayStartPeople = received;
        }
        System.out.println(totalLiked);
        stdin.close();
    }
}