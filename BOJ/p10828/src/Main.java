import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                int k = Integer.parseInt(st.nextToken());
                stack.add(k);
            }
            else if (str.equals("pop")) {
                bw.write((!stack.isEmpty()? stack.pop() : -1) + "\n");
            }
            else if (str.equals("size")) {
                bw.write(stack.size() + "\n");
            }
            else if (str.equals("empty")) {
                bw.write((stack.isEmpty()? 1 : 0) + "\n");
            }
            else if (str.equals("top")) {
                bw.write((!stack.isEmpty()? stack.peek() : -1) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}