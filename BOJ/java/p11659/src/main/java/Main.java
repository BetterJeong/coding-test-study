import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        String[] sList = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(sList[0]));

        for (int i = 1; i < N; i++) {
            list.add(list.get(i-1) + Integer.parseInt(sList[i]));
        }

        for (int i = 0; i < M; i++) {
            String[] k = br.readLine().split(" ");
            int a = Integer.parseInt(k[0]) - 2;
            int b = Integer.parseInt(k[1]) - 1;

            if (a >= 0) {
                bw.write((list.get(b) - list.get(a)) + "\n");
            }
            else {
                bw.write(list.get(b) + "\n");
            }
        }

        bw.flush();
    }
}
