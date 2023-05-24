import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] rank = new int[N];
        int[] temp;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        temp = B.clone();

        for (int i = 0; i < N; i++) {
            int max = 0;
            for (int j = 0; j < N; j++) {
                if (temp[j] > temp[max]) {
                    max = j;
                }
            }
            rank[max] = i;
            temp[max] = -1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (rank[j] == i) {
                    sum += A[i] * B[j];
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}