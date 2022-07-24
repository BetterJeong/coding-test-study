import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solution(String st) {
        char[] ch = st.toCharArray();
        int cnt = 1;
        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length-1) {
                System.out.print(ch[i]);
                if (cnt > 1) {
                    System.out.print(cnt);
                }
            }
            else if (ch[i] == ch[i+1]) {
                cnt++;
            }
            else if (cnt > 1) {
                System.out.print(ch[i]);
                System.out.print(cnt);
                cnt = 1;
            }
            else {
                System.out.print(ch[i]);
                cnt = 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        solution(st);
    }
}