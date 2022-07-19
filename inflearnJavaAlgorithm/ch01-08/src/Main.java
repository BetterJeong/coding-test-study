import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String st) {
        char[] ch = st.toCharArray();
        int lt = 0;
        int rt = ch.length - 1;

        while (lt < rt) {
            if (!Character.isLetterOrDigit(ch[lt])) {
                lt++;
            }
            else if (!Character.isLetterOrDigit(ch[rt])) {
                rt--;
            }
            else if (Character.toLowerCase(ch[lt]) != Character.toLowerCase(ch[rt])) {
                return "NO";
            }
            else {
                lt++;
                rt--;
            }
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(solution(st));
    }
}