import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void star(int x, int y, int t) {
        if(t % x == 1 && t % y == 1) {
            System.out.print(" ");
        }
        else if (t == 1) {
            System.out.print("*");
        }
        else {
            star(x, y, t/3);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                star(i, j, t);
            }
            System.out.println("");
        }
    }
}