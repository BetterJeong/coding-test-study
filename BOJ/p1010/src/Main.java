import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            long num = 1;
            long den = 1;

            for (long j = n; j >= n - r + 1; j--) {
                num *= j;
            }
            for (long j = 1; j <= r; j++) {
                den *= j;
            }

            bw.write(String.valueOf( num / den));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}