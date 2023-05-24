import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        else if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            if (n == 0) break;

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) sum++;
            }

            System.out.println(sum);
        }
    }
}