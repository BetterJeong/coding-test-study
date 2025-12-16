import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int r = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> t = new ArrayList<>();
            t.add(Integer.parseInt(st.nextToken()));
            t.add(0);
            list.add(t);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j || list.get(i).get(1) == 1 || list.get(j).get(1) == 1) {
                    continue;
                }

                if (list.get(i).get(0) + list.get(j).get(0) == M) {
                    list.get(i).set(1, 1);
                    list.get(j).set(1, 1);
                    r += 1;
                    break;
                }
            }
        }

        bw.write(String.valueOf(r));
        bw.flush();
    }
}
