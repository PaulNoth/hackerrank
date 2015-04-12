package cisco;

import java.util.Scanner;

/**
 * 
 * <p>
 * Password security is a very important topic today. We define a password
 * system here as a set of requirements that a valid password in this system
 * must fulfill. In each such system every valid password consists only of
 * digits [0−9]. In addition, for each such system there are two requirements
 * which a valid password must fulfill:
 * </p>
 * <ol>
 * <li>Minimum length of a valid password.
 * <li>Maximum length of a valid password.
 * </ol>
 * <p>
 * We say that a password system is <em>secure</em> if and only if there are
 * <em>more than</em> one million (10<sup>6</sup>) different possible passwords
 * in this system. Your task, as a security expert, is to decide for a given
 * password system if it is secure.
 * </p>
 * <p>
 * Note:
 * <ul>
 * <li>Repetition of digits are allowed. That is 111 is a valid password of
 * length 3.
 * <li>Leading 0's are allowed. That is 001 and 000 are valid password of length
 * 3.
 * <li>You have to consider the sum of all passwords whose length lies in range
 * of minimum and maximum value. That is if minimum length is 3 and maximum
 * length is 5, then you have to find total count of passwords whose length are
 * either 3, 4 or 5.
 * </ul>
 * </p>
 * <p>
 * Input Format <br>
 * In the first line there is a single integer, <b><i>T</i></b>, denoting the
 * number of test cases. <b><i>T</i></b> lines follow. The
 * <b><i>i<sup>th</sup></i></b> line denotes a single test case and describes a
 * given password system. It consists of two integers, <b><i>m</i></b> and
 * <b><i>M</i></b>, denoting the minimum password length and the maximum
 * password length in this system.
 * </p>
 * <p>
 * Constraints <br>
 * 1<=T<=100<br>
 * 1<=m<=M<=10
 * </p>
 * <p>
 * Output Format
 * </p>
 * Print exactly <b><i>T</i></b> lines. In the <b><i>i<sup>th</sup></i></b> of
 * them print <b><i>"YES"</i></b> (without quotes) if the
 * <b><i>i<sup>th</sup></i></b> password system is secure, otherwise print
 * <b><i>"NO"</i></b> (without quotes). </p>
 * <p>
 * Sample Input <br>
 * 2 <br>
 * 5 5<br>
 * 7 8
 * </p>
 * <p>
 * Sample Output <br>
 * NO<br>
 * YES
 * </p>
 * <p>
 * Explanation <br>
 * <br>
 * Sample Case #00 <br>
 * All valid passwords have length 5, hence there are exactly 100000 different
 * passwords; this system in insecure, because we need more than a million
 * different passwords for a system to be secure. <br>
 * <br>
 * Sample Case #01 <br>
 * We are allowed to have passwords of length 7 or 8 and since there are more
 * than a million different such passwords, this system is secure.
 * </p>
 * 
 * @author Pidanic
 *
 */
public class SecurePasswordSystem
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for (int i = 0; i < tests; i++)
        {
            String[] lenghts = stdin.nextLine().split(" ");
            int minLength = Integer.parseInt(lenghts[0]);
            int maxLength = Integer.parseInt(lenghts[1]);
            long combinations = 0;
            for (int exp = minLength; exp <= maxLength; exp++)
            {
                combinations += Math.pow(10, exp);
            }
            if(combinations > 1_000_000)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        stdin.close();
    }

}
