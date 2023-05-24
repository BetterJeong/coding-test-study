import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        double r = 0;

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            arrayList.add(k);
            if (k > max) {
                max = k;
            }
        }

        for (int k : arrayList) {
            r += (double) k / max * 100;
        }

        System.out.println(r / (double)n);
    }
}