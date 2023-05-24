import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double q = 0;
        double p = 0;

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(st.nextToken()) % 3;
            switch (k) {
                case 0:
                    q++;
                    break;
                case 1:
                    p++;
                    break;
                case 2:
                    q--; p--;
                    break;
            }
        }

        System.out.print(String.format("%.8f", p)+" "+String.format("%.8f", q));
    }
}