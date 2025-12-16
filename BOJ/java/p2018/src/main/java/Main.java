import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int f = 1;
        int e = 1;
        int s = 1;
        int r = 1;

        while (f < (N / 2 + 1)) {
            if (s == N) {
                r += 1;
                e += 1;
                s += e;
            }
            else if (s < N) {
                e += 1;
                s += e;
            }
            else {
                s -= f;
                f += 1;
            }
        }

        bw.write(String.valueOf(r));
        bw.flush();
    }
}
