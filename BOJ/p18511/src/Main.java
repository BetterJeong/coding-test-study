import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int n;
    static int k;
    static int nLen;
    static int[] arr;
    static int[] result;
    static int max;
    public static void solution(int cnt) {
        if (cnt == nLen) {
            int tmp = 0;
            int j = nLen-1;
            for (int i = 0; i < nLen; i++) {
                tmp = result[i];

            }
            return ;
        }
        for (int i = 0; i < nLen; i++) {
            result[cnt-1] = arr[i];
            solution(cnt+1);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        nLen = 0;
        arr = new int[k];
        max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n; i > 0; i /= 10) {
            nLen++;
        }
        result = new int [nLen];
    }
}