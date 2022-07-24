import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static String solution(ArrayList arr) {
        String r = "";

        for (int i = 0; i < arr.toArray().length; i++) {
            String s = (String) arr.get(i);
            String tmp = "";
            for (int j = 0; j < 7; j++) {
                if (s.charAt(j) == '#') {
                    tmp += "1";
                }
                else {
                    tmp += "0";
                }
            }
            r += (char)Integer.parseInt(tmp, 2);
        }

        return r;
    }

    public static String solution2(int n, String s) {
        String r = "";

        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            r += (char) num;
            s = s.substring(7);
        }

        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        ArrayList arr = new ArrayList();
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = i * 7; j < i*7 + 7; j++) {
                str += s.charAt(j);
            }
            arr.add(str);
        }
        //System.out.println(solution(arr));
        System.out.println(solution2(n, s));
    }
}