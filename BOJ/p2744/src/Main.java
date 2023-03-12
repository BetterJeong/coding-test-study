import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        for (char c : arr) {
            if (Character.isUpperCase(c)) System.out.print(Character.toLowerCase(c));
            else System.out.print(Character.toUpperCase(c));
        }
    }
}