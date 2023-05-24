import java.io.*;

public class Main {

    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void solution(int n, int from, int tmp, int to) throws IOException {
        if (n == 0) return;
        solution(n-1, from, to, tmp);
        bw.write(from + " " + to + "\n");
        solution(n-1, tmp, from, to);
    }

    public static void main(String[] args) throws IOException {
        int n = 0;
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2, n) - 1);
        solution(n, 1, 2, 3);
        bw.flush();
        br.close();
        bw.close();
    }
}