import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int c = 0;
        int[] target = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        boolean[] scoreA = new boolean[10];
        boolean[] scoreB = new boolean[10];

        for (int i = target.length-1; i >= 0; i--) {
            if (A >= target[i]) {
                scoreA[i] = true;
                A -= target[i];
            }
            if (B >= target[i]) {
                scoreB[i] = true;
                B -= target[i];
            }
        }

        for (int i = 0; i < scoreA.length; i++) {
            if (scoreA[i] && scoreB[i]) continue;
            else if (!scoreA[i] && !scoreB[i]) continue;
            else if (scoreA[i] || scoreB[i]) c += target[i];
        }

        System.out.println(c);
    }
}