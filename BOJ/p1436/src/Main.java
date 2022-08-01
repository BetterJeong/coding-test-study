import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int solution(int n) {
        boolean b = true;
        int k = 0;
        int r = 0;
        for (int i = 666; k < n;i++) {
            char[] arr = Integer.toString(i).toCharArray();
            for (int j = 0; j < arr.length-2; j++) {
                if (arr[j] == '6' && arr[j+1] == '6' && arr[j+2] == '6') {
                    r = i;
                    k++;
                    break;
                }
            }
        }
        return r;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
}