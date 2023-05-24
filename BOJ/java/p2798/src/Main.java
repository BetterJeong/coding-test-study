import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int solution(int[] arr, int b, int t) {
        int r = 0;
            for (int i = 0; i < t - 2; i++) {
                for (int j = i + 1; j < t - 1; j++) {
                    for (int k = j + 1; k < t; k++)  {
                        int n = arr[i] + arr[j] + arr[k];
                        if (n <= b) {
                            if (r < n) {
                                r = n;
                            }
                        }
                    }
                }
            }
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr, b, t));
    }
}