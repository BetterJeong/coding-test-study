import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        char[] route = br.readLine().toCharArray();
        ArrayList<int[]> arr = new ArrayList<>();
        int[] nowXY = { 100, 100 }; // 현재 위치
        int direction = 63;
        int[] dx = { -1, 0, 1, 0 }; // 방향 이동
        int[] dy = { 0, -1, 0, 1 };
        int[] widthMinMax = {200, 0};   // 폭 계산할 때 사용
        int[] heightMinMax = {200, 0};  // 높이 계산할 때 사용
        boolean[][] map;
        int width;
        int height;

        arr.add(new int[]{nowXY[0], nowXY[1]}); // 현재 위치 저장
        for (char c : route) {
            if (c == 'L') { // 방향 왼쪽으로
                direction--;
            }
            else if (c == 'R') {    // 방향 오른쪽으로
                direction++;
            }
            else if (c == 'F') {
                int nowDirection = direction % 4;   // 현재 방향 인덱스
                nowXY[0] += dx[nowDirection];   // 현재 위치에서 1칸 이동
                nowXY[1] += dy[nowDirection];
                arr.add(new int[]{nowXY[0], nowXY[1]}); // 새 위치 추가
            }
        }

        // 최소, 최대값으로 맵 크기 계산
        for (int[] xy : arr) {
            widthMinMax[0] = Math.min(xy[0], widthMinMax[0]);
            widthMinMax[1] = Math.max(xy[0], widthMinMax[1]);
            heightMinMax[0] = Math.min(xy[1], heightMinMax[0]);
            heightMinMax[1] = Math.max(xy[1], heightMinMax[1]);
        }
        width = widthMinMax[1] - widthMinMax[0] + 1;
        height = heightMinMax[1] - heightMinMax[0] + 1;
        map = new boolean[height][width];

        for (int[] xy : arr) {  // 움직인 길 표시
            map[xy[1] - heightMinMax[0]][xy[0] - widthMinMax[0]] = true;
        }

        // 맵 출력
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j]) {
                    System.out.print(".");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}