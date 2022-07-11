import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static int solution(LinkedList<Integer> list, int n, int index) {
        int r = 0;
        int max = 0;
        boolean b = true;

        while (b) {
            max = list.get(1);
            for (int i = 2; i < n; i++) {
                if (max < list.get(i)) {
                    max = list.get(i);
                }
            }
            if (list.get(0) >= max) {
                list.remove();
                r++;
            }
            else {
                list.addLast(list.get(0));
                list.remove();
            }
            if (index == 0) {
                b = false;
            }
            else {
                index--;
                if (index < 0) {
                    index = n;
                }
            }
        }

        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            System.out.println(solution(list, n, index));
            t--;
        }
    }
}