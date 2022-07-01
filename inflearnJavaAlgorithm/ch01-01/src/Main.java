import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int solution(String str, char s) {
        int result = 0;

        str = str.toUpperCase();
        s = Character.toUpperCase(s);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                result ++;
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char s = br.readLine().charAt(0);

        System.out.println(solution(str, s));
    }
}