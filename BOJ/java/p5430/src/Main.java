import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            Deque<Integer> deque = new LinkedList<>();
            boolean b = true;
            boolean isReversed = false;

            for (int j = 0; j < n; j++) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < p.length; j++) {
                if (p[j] == 'D') {
                    if (!deque.isEmpty()) {
                        if (!isReversed) {
                            deque.pollFirst();
                        }
                        else {
                            deque.pollLast();
                        }
                    }
                    else {
                        b = false;
                        break;
                    }
                }
                if (p[j] == 'R') {
                    if (isReversed) {
                        isReversed = false;
                    }
                    else {
                        isReversed = true;
                    }
                }
            }

            if (b) {
                if (deque.size() != 0) {
                    bw.write("[");

                    if (!isReversed) {
                        bw.write(String.valueOf(deque.pollFirst()));
                        while (!deque.isEmpty()) {
                            bw.write("," + deque.pollFirst());
                        }
                    } else {
                        bw.write(String.valueOf(deque.pollLast()));
                        while (!deque.isEmpty()) {
                            bw.write("," + deque.pollLast());
                        }
                    }

                    bw.write("]" + "\n");
                }
                else {
                    bw.write("[]\n");
                }

            }
            else {
                bw.write("error"+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}