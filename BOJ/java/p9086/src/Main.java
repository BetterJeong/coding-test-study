import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        char[] arr;

        for (int i = 0; i < T; i++) {
            arr = br.readLine().toCharArray();
            System.out.println(String.valueOf(arr[0])+arr[arr.length-1]);
        }
    }
}