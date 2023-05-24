import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String st = br.readLine();
            if (st.equals("0")) {
                break;
            }

            char[] ch = st.toCharArray();
            int l = 0;
            int r = ch.length - 1;
            boolean b = true;

            while (l < r) {
                if (ch[l] == ch[r]) {
                    l++;
                    r--;
                }
                else {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}