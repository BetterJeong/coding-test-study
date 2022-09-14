import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = 0;

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            boolean[] alpha = new boolean[26];
            char pre = arr[0];
            alpha[arr[0]-'a'] = true;
            boolean check = true;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == pre) {
                    continue;
                }
                else if (alpha[arr[j]-'a'] == false) {
                    alpha[arr[j]-'a'] = true;
                }
                else {
                    check = false;
                    break;
                }
                pre = arr[j];
            }

            if (check) {
                r++;
            }
        }

        System.out.println(r);
    }
}