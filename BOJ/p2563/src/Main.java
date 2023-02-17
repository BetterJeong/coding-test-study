import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int PAPER_MAX = 100;
    static int COLOR_PAPER = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[][] paper = new boolean[PAPER_MAX][PAPER_MAX];
        int N = Integer.parseInt(br.readLine());
        int r = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = 0; j < COLOR_PAPER; j++) {
                for (int k = 0; k < COLOR_PAPER; k++) {
                    paper[y+j][x+k] = true;
                }
            }
        }

        for (int i = 0; i < PAPER_MAX; i++) {
            for (int j = 0; j < PAPER_MAX; j++) {
                if (paper[i][j]) {
                    r++;
                }
            }
        }

        System.out.println(r);
    }
}