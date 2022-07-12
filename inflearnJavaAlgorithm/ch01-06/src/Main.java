import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String st) {
        String r = "";

        for (int i = 0; i < st.length(); i++) {
            if (st.indexOf(st.charAt(i)) == i) {
                r += st.charAt(i);
            }
        }

        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(solution(st));
    }
}