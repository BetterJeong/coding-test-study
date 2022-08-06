import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int mean;
    public static int median;
    public static int mode;
    public static int range;
    public static void solution(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        mean = (int) Math.round((double) sum / (double) n);

        Arrays.sort(arr);
        median = arr[n/2];

        int[] modeArr = new int[8001];
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            modeArr[arr[i]+4000]++;
        }
        for (int i = 0; i < 8001; i++) {
            if (max < modeArr[i]) {
                max = modeArr[i];
            }
        }
        for (int i = 0; i < 8001; i++) {
            if (modeArr[i] == max) {
                mode = i - 4000;
                cnt++;
            }
            if (cnt >= 2) {
                break;
            }
        }

        range = arr[n-1] - arr[0];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mean = 0; median = 0; mode = 0; range = 0;
        solution(n, arr);
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}