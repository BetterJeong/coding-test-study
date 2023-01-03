import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Score> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                Score score = new Score(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                list.add(score);
            }
            for (int j = 0; j < list.size(); j++) {
                Score standard = list.get(j);
                for (int k = 0; k < list.size(); k++) {
                    if (j == k) continue;
                    Score target = list.get(k);
                    if (standard.document < target.document && standard.interview < target.interview) {
                        list.remove(k);
                    }
                    if (standard.document > target.document && standard.interview > target.interview) {
                        list.remove(j);
                        break;
                    }
                }
            }
            System.out.println(list.size());
        }
    }
}

class Score {
    int document;
    int interview;

    public Score(int document, int interview) {
        this.document = document;
        this.interview = interview;
    }
}