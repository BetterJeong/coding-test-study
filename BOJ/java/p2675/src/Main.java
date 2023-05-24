import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}