import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v+" ");

        for (int i : arrayList[v]) {
            if (!visited[i]) dfs(i);
        }
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int i = q.poll();
            System.out.print(i + " ");

            for (int j : arrayList[i]) {
                if (!visited[j]) {
                    visited[j] = true;
                    q.add(j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        arrayList = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) arrayList[i] = new ArrayList<>();

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(arrayList[i]);
        }

        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }
}