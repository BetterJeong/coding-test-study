import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
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
            int t = i;
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (t == 0) {
                if (button.contains(0)) {
                    b = false;
                }
                else {
                    arrayList.add(0);
                }
            }
            while (t > 0) {
                if (button.contains(t % 10)) {
                    b = false;
                    break;
                }
                else {
                    arrayList.add(t % 10);
                }
                t /= 10;
            }

            if (b) {
                r = Math.min(r, arrayList.size() + Math.abs(n - i));
            }
        }

        System.out.println(r);
    }
}