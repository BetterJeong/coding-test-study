import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int solution(ArrayList arr, int b) {
        int r = 0;
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList arr = new ArrayList();
        for (int i = 0; i < t; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(solution(arr, b));
    }
}