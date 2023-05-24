import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<Score> q = new PriorityQueue<>();
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                Score score = new Score(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                q.add(score);
            }

            ArrayList<Score> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                list.add(q.poll());
            }

            int min = list.get(0).interview;

            for (int j = 1; j < list.size(); j++) {
                if (list.get(j).interview > min) {
                    list.remove(j);
                    j--;
                }
                else {
                    min = list.get(j).interview;
                }
            }

            System.out.println(list.size());
        }
    }
}

class Score implements Comparable<Score> {
    int document;
    int interview;

    public Score(int document, int interview) {
        this.document = document;
        this.interview = interview;
    }

    @Override
    public int compareTo(Score o) {
        if (this.document < o.document) {
            return -1;
        }
        else if (this.document > o.document) {
            return 1;
        }
        return 0;
    }
}