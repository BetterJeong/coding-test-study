import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String str) {
        String result = "";
        String[] arr = str.split(" ");

        for (String s : arr) {
            if (s.length() > result.length()) {
                result = s;
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}