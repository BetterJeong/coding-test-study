import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void solution(int n, int from, int tmp, int to) {
        if (n == 0) return;
        solution(n-1, from, to, tmp);
        System.out.println(from + " " + to);
        solution(n-1, tmp, from, to);
    }

    public static void main(String[] args) throws IOException {
        int n = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2, n) - 1);
        solution(n, 1, 2, 3);
    }
}