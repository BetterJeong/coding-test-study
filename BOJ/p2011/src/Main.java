import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int min = 0, max = 0;
        int r = 0;

        for (int i = t; i >= 1; ) {
            if (i == 1) {
                min++;
                break;
            }
            if (i % 10 >= 3) {
                i /= 100;
            }
            else if ((i / 10) % 10 <= 2) {
                i /= 100;
            }
            else {
                i /= 10;
            }
            min++;
        }

        for (int i = t; i >= 1; i /= 10) {
            max++;
        }

        System.out.println(min);
        System.out.println(max);

        String st = Integer.toString(t);
        char[] arr = st.toCharArray();

        for (int i = min; i <= max; i++) {

        }

        System.out.println(r % 1000000);
    }
}