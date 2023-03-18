import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] temp = new int[j-i+2];
            int a = 0;

            for (int b = k; b <= j; a++, b++) {
                temp[a] = arr[b];
            }
            for (int b = i; b < k; a++, b++) {
                temp[a] = arr[b];
            }

            for (int b : temp) {
                if (i > j) break;
                arr[i] = b;
                i++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}