import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] map;
    static boolean[][] visited;
    static int M;
    static int N;
    static int result;

    static void dfs(int y, int x) {
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N && map[ny][nx] && !visited[ny][nx]) {
                dfs(ny, nx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new boolean[N][M];
            visited = new boolean[N][M];
            result = 0;

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[y][x] = true;
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] && !visited[j][k]) {
                        dfs(j, k);
                        result++;
                    }
                }
            }

            System.out.println(result);
        }
    }
}