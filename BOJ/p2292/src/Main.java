import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = 1;
        int i = 2;

        while (i <= n) {
            i = i + (6 * r);
            r++;
        }

        System.out.println(r);
    }
}