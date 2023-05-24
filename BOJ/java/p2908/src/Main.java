import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer(st.nextToken());
        int a = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuffer(st.nextToken());
        int b = Integer.parseInt(sb.reverse().toString());

        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}