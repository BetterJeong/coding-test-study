import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solution(String s) {
        char[] ch = s.toLowerCase().toCharArray();
        int lt = 0;
        int rt = ch.length - 1;

        while (lt < rt) {
            if (ch[lt] != ch[rt]) {
                System.out.println("NO");
                return;
            }
            lt++; rt--;
        }
        System.out.println("YES");
    }

    public static void solution2(String s) {
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(tmp)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        solution2(s);
    }
}