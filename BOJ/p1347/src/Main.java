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
        int[] nowXY = { 100, 100 };
        int direction = 3;
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, -1, 0, 1};
        int[] widthMinMax = {200, 0};
        int[] heightMinMax = {200, 0};
        boolean[][] map;
        int width;
        int height;

        arr.add(nowXY);
        for (char c : route) {
            if (c == 'L') {
                direction--;
            }
            else if (c == 'R') {
                direction++;
            }
            else if (c == 'F') {
                int nowDirection = direction % 4;
                nowXY[0] += dx[nowDirection];
                nowXY[1] += dy[nowDirection];
                int[] newPosition = {nowXY[0], nowXY[1]};
                arr.add(newPosition);
            }
        }

        for (int[] xy : arr) {
            widthMinMax[0] = Math.min(xy[0], widthMinMax[0]);
            widthMinMax[1] = Math.max(xy[0], widthMinMax[1]);
            heightMinMax[0] = Math.min(xy[1], widthMinMax[0]);
            heightMinMax[1] = Math.max(xy[1], widthMinMax[1]);
        }

        width = widthMinMax[1] - widthMinMax[0] + 1;
        height = heightMinMax[1] - heightMinMax[0] + 1;
        map = new boolean[height][width];

        for (int[] xy : arr) {
            map[xy[1] % height][xy[0] % width] = true;
        }

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