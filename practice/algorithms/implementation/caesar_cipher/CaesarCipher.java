import java.util.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int length = stdin.nextInt();
        String text = stdin.next();
        int shift = stdin.nextInt();
        for(int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'z') {
                System.out.print((char)(((int)c - (int)'a' + shift) % 26 + (int)'a'));
            } else if(c >= 'A' && c <= 'Z') {
                System.out.print((char)(((int)c - (int)'A' + shift) % 26 + (int)'A'));
            } else {
                System.out.print(c);
            }
        }
        stdin.close();
    }
}