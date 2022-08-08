import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        int[] arr = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(n.toCharArray()[i]));
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            bw.write(String.valueOf(arr[i]));
        }
        bw.close();
    }
}