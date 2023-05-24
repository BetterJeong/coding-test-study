import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            Queue<Character> q = new LinkedList<>();
            boolean b = false;

            if (arr[0] != ')' && arr[arr.length-1] != '(') {
                int j;
                for (j = 0; j < arr.length; j++) {
                    if (arr[j] == '(') q.add('(');
                    else if (q.isEmpty()) break;
                    else {
                        q.poll();
                    }
                }
                if (j == arr.length && q.isEmpty()) b = true;
            }

            if (b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}