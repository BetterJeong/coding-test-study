import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] solution(String s, String t) {
        char[] ch = s.toCharArray();
        int[] r = new int[ch.length];
        char c = t.charAt(0);
        int n = 1000;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
                n = 0;
                r[i] = n;
            }
            else {
                n++;
                r[i] = n;
            }
        }

        n = 1000;

        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == c) {
                n = 0;
            }
            else {
                n++;
                r[i] = r[i] > n ? n : r[i];
            }
        }

        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String t = st.nextToken();

        for (int i : solution(s, t)) {
            System.out.print(i+" ");
        }
    }
}