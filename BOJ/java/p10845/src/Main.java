import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) queue.addLast(Integer.parseInt(st.nextToken()));
            else if (str.equals("size")) bw.write(queue.size()+"\n");
            else if (queue.isEmpty()) {
                if (str.equals("empty")) bw.write("1\n");
                else bw.write("-1\n");
            }
            else {
                if (str.equals("pop")) bw.write(queue.pollFirst()+"\n");
                else if (str.equals("empty")) bw.write("0\n");
                else if (str.equals("front")) bw.write(queue.peekFirst()+"\n");
                else if (str.equals("back")) bw.write(queue.peekLast()+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}