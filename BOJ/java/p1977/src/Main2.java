import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int sum = 0;
        int num = 0;

        for (int i = max; i >= min; i--) {
            double d = Math.sqrt(i);
            int n = (int) (d + 0.5);
            if (n * n == i) {
                sum += i;
                num = i;
            }
        }

        if (sum == 0) {
            bw.write("-1");
        }
        else {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(num));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
