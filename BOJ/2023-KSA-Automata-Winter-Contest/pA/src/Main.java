import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (true) {
            if (isPrime(N)) {
                System.out.println(N);
                break;
            }
            N++;
        }
    }

    public static boolean isPrime(int k) {
        boolean b = false;

        for (int i = 2; i < Math.sqrt(k); i++) {
            if (k % i == 0) {
                b = true;
                break;
            }
        }

        return b;
    }
}