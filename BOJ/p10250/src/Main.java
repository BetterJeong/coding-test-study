import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (n % h == 0) {
                if (n / h >= 10) {
                    System.out.println(String.valueOf(h) + n/h);
                }
                else {
                    System.out.println(h + "0" + n/h);
                }
            }
            else {
                if (n/h + 1 >= 10) {
                    System.out.println(String.valueOf(n % h) + (n/h + 1));
                }
                else {
                    System.out.println(n%h + "0" + (n/h + 1));
                }
            }
        }
    }
}