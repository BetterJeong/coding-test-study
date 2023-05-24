import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] array;
    static boolean[] visit;
    static int r;

    public static void dfs(int x) {
        visit[x] = true;

        for (int y : array[x]) {
            if (visit[y] == false) {
                r++;
                dfs(y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        array = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            array[i] = new ArrayList<>();
        }
        visit = new boolean[n+1];
        r = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            array[u].add(v);
            array[v].add(u);
        }

        dfs(1);

        System.out.println(r);
    }
}