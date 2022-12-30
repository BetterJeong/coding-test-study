import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int [n+1][2];
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[n+1][k+1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1;j < k + 1; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= arr[i][0]) {
                    dp[i][j] = Math.max(dp[i - 1][j], arr[i][1] + dp[i - 1][j - arr[i][0]]);
                }
            }
        }

        System.out.println(dp[n][k]);
    }
}