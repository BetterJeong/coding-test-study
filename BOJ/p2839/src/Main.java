import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> five = new ArrayList<>();
        boolean b = false;
        int sum = 0;

        for (int i = 0 ,j = 0; j <= N; i++, j += 3) {
            three.add(j);
        }
        for (int i = 0 ,j = 0; j <= N; i++, j += 5) {
            five.add(j);
        }

        for (int i = 0; i < three.size(); i++) {
            for (int j = 0; j < five.size(); j++) {
                if (three.get(i) + five.get(j) == N) {
                    sum = i + j;
                    b = true;
                    break;
                }
            }
            if (b) break;
            if (i == three.size() - 1) sum = -1;
        }

        System.out.println(sum);
    }
}