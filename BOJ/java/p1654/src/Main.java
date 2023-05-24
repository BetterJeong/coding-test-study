import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        long lt = 1;
        long line = 0;
        long rt = arr[K-1];

        while (lt <= rt) {
            long mid = (lt + rt) / 2;
            long n = 0;

            for (long i : arr) {
                n += i / mid;
            }

            if (n >= N) {
                line = Math.max(mid, line);
                lt = mid + 1;
            }
            else {
                rt = mid - 1;
            }
        }

        System.out.println(line);
    }
}