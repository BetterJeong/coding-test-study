import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        BigInteger sum = new BigInteger("1");
        char[] chars;
        int result = 0;

        if (N == 0) bw.write("0");
        else {
            for (int i = 1; i <= N; i++) {
                sum = sum.multiply(new BigInteger(String.valueOf(i)));
            }

            chars = sum.toString().toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] != '0') break;
                else result++;
            }

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}