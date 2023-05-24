import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> button = new ArrayList<>();
        if (m != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                button.add(Integer.parseInt(st.nextToken()));
            }
        }
        int r = Math.abs(n - 100);

        for (int i = 0; i < 1000000; i++) {
            boolean b = true;
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                if (button.contains(str.charAt(j) - '0')) {
                    b = false;
                    break;
                }
            }

            if (b) {
                r = Math.min(r, str.length() + Math.abs(n - i));
            }
        }

        System.out.println(r);
    }
}
