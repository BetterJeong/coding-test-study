import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int sum = 0;
        int num = 101;

        for (int i = 0; i < 101; i++) {
            int n = i*i;
            if (n <= max && n >= min) {
                if (i < num) {
                    num = i;
                }
                sum += n;
            }
        }

        if (sum == 0) {
            bw.write("-1");
        }
        else {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(num*num));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}