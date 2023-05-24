import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] max = new int[2];
        StringTokenizer st;

        max[0] = 1;
        max[1] = 1;
        int m = 0;

        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 9; j++) {
                int n = Integer.parseInt(st.nextToken());

                if (n > m) {
                    max[0] = i;
                    max[1] = j;
                    m = n;
                }
            }
        }

        System.out.println(m);
        System.out.println(max[0] + " " + max[1]);
    }
}