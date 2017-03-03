import java.util.*;

public class GradingStudents {

    private static int professorGradeRule(int grade) {
        int multiply5 = grade / 5;
        int roundBy5 = (grade % 5 == 0) ? (multiply5 * 5) : ((multiply5 + 1) * 5);
        if(roundBy5 - grade < 3 && grade >= 38) {
            return roundBy5;
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            int grade = Integer.parseInt(stdin.nextLine());
            int finalGrade = professorGradeRule(grade);
            System.out.println(finalGrade);
        }
        stdin.close();
    }
}