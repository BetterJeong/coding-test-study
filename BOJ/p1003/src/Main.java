import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<int[]> fibo = new ArrayList<>();

        fibo.add(new int[]{1, 0});
        fibo.add(new int[]{0, 1});

        for (int i = 2; i <= 40; i++) {
            int[] arr = new int[2];
            arr[0] = fibo.get(i-2)[0] + fibo.get(i-1)[0];
            arr[1] = fibo.get(i-2)[1] + fibo.get(i-1)[1];
            fibo.add(arr);
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(fibo.get(n)[0]+" "+fibo.get(n)[1]);
        }
    }
}