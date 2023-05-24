import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void bfs() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] paper = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        int[] w = {-1, 0, 1, 0};
        int[] h = {0, -1, 0, 1};
        int r = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int sum = 0;
                for (int k = 0; k < 4; k++) {
                    if (i + h[k] >= 0 && j + w[k] >= 0 && i + h[k] < N && j + w[k] < M) {

                    }
                }
            }
        }
    }
}