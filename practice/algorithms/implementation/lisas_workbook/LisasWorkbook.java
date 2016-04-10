import java.util.*;

public class LisasWorkbook {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int page = 1;
        int specialProblems = 0;
        for(int i = 0; i < n; i++) {
            int problemsPerChapter = stdin.nextInt();
            for(int p = 1; p <= problemsPerChapter; p++) {
                if(p == page) {
                    specialProblems++;
                }
                if((p != problemsPerChapter) && (p % k == 0)) {
                    page++;
                }
            }
            page++;
        }
        System.out.println(specialProblems);
        stdin.close();
    }
}