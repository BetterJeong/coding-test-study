import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            boolean b = false;
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if (arr[0] == 0) break;

            for (int i = 0; i < 3; i++) {
                if (arr[i] * arr[i] == arr[(i+1)%3] * arr[(i+1)%3] + arr[(i+2)%3] * arr[(i+2)%3]) {
                    b = true;
                }
            }

            if (b) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}