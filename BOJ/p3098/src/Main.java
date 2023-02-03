import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] arr = new ArrayList[N+1];
        boolean b = true;
        int days = 0;

        for (int i = 0; i < N+1; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            arr[l].add(r);
            arr[r].add(l);
        }

        while (b) {
            for (int i = 0; i < arr.length; i++) {
                for (int friend : arr[i]) {
                    for (int f : arr[friend]) {
                        if (f != i && !arr[i].contains(f)) {
                            arr[i].add(f);
                        }
                    }
                }
            }

            for (ArrayList a : arr) {
                if (a.size() < N - 1) {
                    break;
                }
                b = false;
            }

            days++;
        }

        System.out.println(days);
    }
}