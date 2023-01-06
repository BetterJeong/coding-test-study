import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<int[]> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                list.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
            }

            list.sort(Comparator.comparingInt(o -> o[0]));

            int r = 1;
            int min = list.get(0)[1];

            for (int j = 1; j < list.size(); j++) {
                if (list.get(j)[1] < min) {
                    min = list.get(j)[1];
                    r++;
                }
            }

            System.out.println(r);
        }
    }
}