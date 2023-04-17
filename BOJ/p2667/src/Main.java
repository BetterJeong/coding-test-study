import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static boolean[][] visited;
    static char[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N;
    static int sum = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][];
        visited = new boolean[N][N];
        arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '1' && !visited[i][j]) {
                    sum++;
                    dfs(j, i);
                }
            }
        }

        System.out.println(sum);
        Arrays.sort(arr);
        for (int i = 1000-sum; i < 1000; i++) {
            System.out.println(arr[i]);
        }
    }

    static void dfs(int x, int y) {
        visited[y][x] = true;
        arr[sum]++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (!visited[ny][nx] && map[ny][nx] == '1') {
                    dfs(nx, ny);
                }
            }
        }
    }
}