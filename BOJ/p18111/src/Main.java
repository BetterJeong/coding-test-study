import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] blocks = new int[N][M];
        int min = 256;
        int max = 0;
        int height = 0;
        int time = 2147483647;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int n = Integer.parseInt(st.nextToken());

                blocks[i][j] = n;

                if (n > max) {
                    max = n;
                }

                if (n < min) {
                    min = n;
                }
            }
        }

        for (int i = min; i <= max; i++) {
            int restBlock = B;  // 인벤토리에 있는 블록 수
            int tempTime = 0;

            // 블록 먼저 파기
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (blocks[j][k] > i) {
                        int n = blocks[j][k] - i;

                        tempTime += n * 2;
                        restBlock += n;
                    }
                }
            }
            
            // 블록 심기
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (blocks[j][k] < i) {
                        int blockNeeded = i - blocks[j][k];

                        tempTime += blockNeeded;
                        restBlock -= blockNeeded;
                    }
                }
            }

            if (restBlock >= 0) {
                if (tempTime == time) {
                    height = Math.max(i, height);
                }
                else if (tempTime < time) {
                    time = tempTime;
                    height = i;
                }
            }
        }

        System.out.println(time + " " + height);
    }
}