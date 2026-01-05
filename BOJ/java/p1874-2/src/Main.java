import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        int now = 1;

        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());

            for (; now <= t; now++) {
                s.add(now);
                sb.append("+\n");
            }

            if (s.peek() != t) {
                System.out.println("NO");
                return;
            }

            s.pop();
            sb.append("-\n");
        }

        System.out.println(sb);
    }
}