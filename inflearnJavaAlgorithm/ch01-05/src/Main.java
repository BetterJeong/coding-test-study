import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String str) {
        String r = "";
        char[] ch = str.toCharArray();
        int lt = 0;
        int rt = ch.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(ch[lt])) {
                lt++;
            }
            else if (!Character.isAlphabetic(ch[rt])) {
                rt--;
            }
            else {
                char k = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = k;
                lt++;
                rt--;
            }
        }

        r = String.valueOf(ch);

        return r;
    }

    public static void main(String[] args) throws IOException {
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        System.out.println(solution(str));
    }
}