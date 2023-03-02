import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        Queue<int[]> queue = new LinkedList<>();
        ArrayList<int[]> arrayList = new ArrayList<>();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) queue.add(new int[]{i, Integer.parseInt(st.nextToken())});

            while (!queue.isEmpty()) {
                Iterator<int[]> iterator = queue.iterator();
                boolean b = false;

                int priority = iterator.next()[1];
                while (iterator.hasNext()) {
                    if (iterator.next()[1] > priority) {
                        b = true;
                        break;
                    }
                }

                if (b) queue.add(queue.poll());
                else arrayList.add(queue.poll());
            }

            for (int i = 0; i < arrayList.size(); i++) {
                int[] arr = arrayList.get(i);
                if (arr[0] == M) {
                    System.out.println(i+1);
                    break;
                }
            }

            queue.clear();
            arrayList.clear();
        }
    }
}