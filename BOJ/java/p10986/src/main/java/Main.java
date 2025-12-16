import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long r = 0;

        long[] sum = new long[N];
        long[] mod = new long[N];

        st = new StringTokenizer(br.readLine());

        sum[0] = Integer.parseInt(st.nextToken());
        mod[0] = sum[0] % M;

        for (int i = 1; i < N; i++) {
            sum[i] = Integer.parseInt(st.nextToken()) + sum[i - 1];
            mod[i] = sum[i] % M;
        }

        for (int i = 0; i < N; i++) {
            if (mod[i] == 0) {
                r += 1;
            }
        }

        for (int i = 0; i < M; i++) {
            int t = 0;

            for (int j = 0; j < N; j++) {
                if (mod[j] == i) {
                    t += 1;
                }
            }

            r += (long) t * (t-1) / 2;
        }

        bw.write(String.valueOf(r));
        bw.flush();
    }
}
