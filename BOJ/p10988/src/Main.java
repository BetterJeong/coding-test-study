import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int left = 0;
        int right = arr.length - 1;
        boolean b = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                b = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(b ? 1 : 0);
    }
}