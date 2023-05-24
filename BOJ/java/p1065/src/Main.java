import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int r = 0;

    public static boolean solution(int i) {
        if (i < 100) {
            return true;
        }
        else if ((i/10) % 10 - i % 10 == i/100 - (i/10) % 10) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (solution(i)) {
                r++;
            }
        }

        System.out.println(r);
    }
}