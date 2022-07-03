import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void solution(int t, String[] st) {
        for (int i = 0; i < t; i++) {
            String str = st[i];
            char[] ch = str.toCharArray();
            for (int j = ch.length - 1; j >= 0; j--) {
                System.out.print(ch[j]);
            }
            System.out.println("");
        }
    }

    public static ArrayList<String> solution2(String[] st) {
        ArrayList<String> arr = new ArrayList<>();
        for (String x : st) {
            String tmp = new StringBuilder(x).reverse().toString();
            arr.add(tmp);
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] st = new String[t];

        for (int i = 0; i < t; i++) {
            st[i] = br.readLine();
        }

        solution(t, st);

        for (String x : solution2(st)) {
            System.out.println(x);
        }
    }
}