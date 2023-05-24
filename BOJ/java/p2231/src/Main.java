import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int solution(int n) {
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = i; j > 0; j /= 10) {
                t += j % 10;
            }
            if (t + i ==  n) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
}