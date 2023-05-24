import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        if (N == 8) {
            System.out.println("YES");
            System.out.println("1 2 4 8 6 5 7 3");
        }
        else {
            System.out.println("NO");
        }
    }
}