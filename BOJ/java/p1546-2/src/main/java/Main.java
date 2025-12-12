import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int M = 0;
        double r = 0;

        for (String s : br.readLine().split(" ")) {
            int n = Integer.parseInt(s);
            list.add(n);
            M = Math.max(M, n);
        }

        for (int i = 0; i < N; i++) {
            r += (double) list.get(i) / M * 100;
        }

        bw.write(String.valueOf(r / N));
        bw.flush();
    }
}
