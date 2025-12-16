import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int r = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N-1;

            while (left < right) {
                if (left == i) {
                    left += 1;
                    continue;
                }
                if (right == i) {
                    right -= 1;
                    continue;
                }

                if (arr[left] + arr[right] == arr[i]) {
                    r += 1;
                    break;
                }

                if (arr[left] + arr[right] < arr[i]) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        bw.write(String.valueOf(r));
        bw.flush();
    }
}
