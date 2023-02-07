import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int result = Integer.MAX_VALUE;

    static int[] dx = {-1 ,0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    private static void dfs(int count, int sum) {   // 꽃을 심을 수 있는 모든 경우의 수 탐색
        if (count >= 3) {   // 꽃 3개 심으면 가격이 최솟값인지 확인
            result = Math.min(result, sum);
        }
        else {
            for (int i = 1; i < N-1; i++) {
                for (int j = 1; j < N-1; j++) {
                    if (isPossible(i, j)) { // 현재 위치, 상하좌우에 심어져 있는지 확인
                        setVisited(i, j, true); // 꽃 심기
                        dfs(count+1, sum + sum(i, j));  // 다음 꽃 심기
                        setVisited(i, j, false);    // 마지막으로 심은 꽃 제거
                    }
                }
            }
        }
    }

    private static void setVisited(int x, int y, boolean b) {   // 방문 여부 b 로 초기화
        visited[x][y] = b;
        for (int i = 0; i < 4; i++) {
            visited[x+dx[i]][y+dy[i]] = b;
        }
    }

    private static boolean isPossible(int x, int y) {   // 꽃 심을 수있는지 확인
        if (visited[x][y]) {    // 현재 위치 심어져 있으면
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (visited[x + dx[i]][y + dy[i]]) {    // 상하좌우에 심어져 있으면
                return false;
            }
        }
        return true;
    }

    private static int sum(int x, int y) {  // 가격 계산
        int sum = map[x][y];
        for (int i = 0; i < 4; i++) {
            sum += map[x+dx[i]][y+dy[i]];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(result);
    }
}