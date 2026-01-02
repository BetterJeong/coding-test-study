import java.io.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<int[]> d = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(st.nextToken());

            while (!d.isEmpty() && d.getLast()[1] > t) {
                d.removeLast();
            }

            int[] a = {i, t};
            d.addLast(a);

            if (d.getFirst()[0] <= i - L) {
                d.removeFirst();
            }

            bw.write(d.getFirst()[1] + " ");
        }

        bw.flush();
        bw.close();
    }
}
