import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            int cnt = 1;
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'X') {
                    cnt = 1;
                }
                else {
                    sum += cnt;
                    cnt++;
                }
            }

            System.out.println(sum);
        }
    }
}