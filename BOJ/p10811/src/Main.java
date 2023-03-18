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

        for (int i = 1; i < arr.length; i++) arr[i] = i;

        for (int T = 0; T < M; T++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int[] temp = new int[j-i+1];

            for (int k = 0, l = j; k < temp.length; k++, l--) temp[k] = arr[l];

            for (int k = 0; i <= j; i++, k++) arr[i] = temp[k];
        }

        for (int i = 1; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}