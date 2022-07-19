import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int solution(String st) {
        String r = "";
        char[] ch = st.toCharArray();
        for (char c : ch) {
            if (Character.isDigit(c)) {
                r += c;
            }
        }
        int i = Integer.parseInt(r);
        return i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(solution(st));
    }
}