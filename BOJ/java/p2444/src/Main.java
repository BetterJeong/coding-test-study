import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0, j = 1; i < N; i++, j += 2) {
            for (int k = N-i-1; k > 0; k--) System.out.print(" ");
            for (int k = 0; k < j; k++) System.out.print("*");
            System.out.println();
        }
        for (int i = N, j = 2*N-3; i > 0; i--, j -= 2) {
            for (int k = i-1; k < N; k++) System.out.print(" ");
            for (int k = 0; k < j; k++) System.out.print("*");
            System.out.println();
        }
    }
}