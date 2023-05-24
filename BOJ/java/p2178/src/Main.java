import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // 상하좌우 이동
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int n;
    static int m;
    static boolean[][] visited; // 방문 여부

    public static int bfs(int[][] arr) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0, 1)); // 루트 노드 추가 (0,0)
        visited[0][0] = true;   // 루트 방문

        while (!q.isEmpty()) {
            Node node = q.poll();   // 큐에서 하나 꺼내서
            // 목적지면 이동 거리 반환
            if (node.x == m - 1 && node.y == n - 1) {
                return node.distance;
            }

            for (int i = 0; i < 4; i++) {
                int tempX = node.x + dx[i];
                int tempY = node.y + dy[i];
                // 상하좌우 값이 맵 안에 있고 벽이 아니고 방문하지 않았으면 거리 1 추가 후 큐에 담기
                if (tempX >= 0 && tempY >= 0 && tempX < m && tempY < n) {
                    if (arr[tempY][tempX] == 1 && !visited[tempY][tempX]) {
                        visited[tempY][tempX] = true;
                        q.offer(new Node(tempX, tempY, node.distance + 1));
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(arr));
    }
}

class Node {
    int x;
    int y;
    int distance;

    Node(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}