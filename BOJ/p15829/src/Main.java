import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] array = br.readLine().toCharArray();
        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < L; i++) {
            BigInteger n = BigInteger.valueOf((int) array[i] - 96);
            BigInteger r = new BigInteger("31");
            sum = sum.add(r.pow(i).multiply(n));
        }

        System.out.println(sum.remainder(new BigInteger("1234567891")));
    }
}