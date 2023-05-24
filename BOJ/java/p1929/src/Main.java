import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[N+1];
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i + i; j <= N; j += i) {
                arr[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!arr[i]) bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}