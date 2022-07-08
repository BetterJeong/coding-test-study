import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int solution(int n ,int[] arr) {
        int r = 0;
        String sn = String.valueOf(n);
        char[] ch = sn.toCharArray();
        int pre = 0;
        int max = 0;

        for(int j = ch.length; j > 0; j--) {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (pre*10 + Character.getNumericValue(ch[j-1]) > arr[i] && max < arr[i]) {
                    max = arr[i];
                }
            }
            r += (max * Math.pow(10, j));
        }

        return r;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}