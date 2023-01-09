import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int divisor = 0;

        for (int i = 1; i <= min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                divisor = max(divisor, i);
            }
        }

        System.out.println(divisor);
        System.out.println(n * m / divisor);
    }
}