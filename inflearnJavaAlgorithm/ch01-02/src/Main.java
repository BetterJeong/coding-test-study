import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result += Character.toLowerCase(str.charAt(i));
            }
            else {
                result += Character.toUpperCase(str.charAt(i));
            }
        }

        return result;
    }
    public static String solution2(String str) {
        String result = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                result += Character.toUpperCase(x);
            }
            else {
                result += Character.toLowerCase(x);
            }
        }

        return result;
    }
    public static String solution3(String str) {
        String result = "";

        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) {
                result += (char)(x-32);
            }
            else {
                result += (char)(x+32);
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