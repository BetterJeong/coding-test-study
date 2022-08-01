import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int solution(String[] arr, int x, int y) {
        int r = 64;
        for (int i = 0; i < x-7; i++) {
            for (int j = 0; j < y-7; j++) {
                // 1. 인덱스 짝수: B, 홀수 W
                // 2. 인덱스 짝수: W, 홀수 B
                for (int k = 0; k < 2; k++) {
                    int sum = 0;
                    for (int n = 0; n < 8; n++) {
                        char[] ch = arr[j+n].substring(i, i+8).toCharArray();
                        for (int m = 0; m < 8; m++) {
                            if ((n+m)%2 == 0) {
                                if (k == 0) {
                                    if (ch[m] != 'B') {
                                        sum++;
                                    }
                                }
                                else if (k == 1) {
                                    if (ch[m] != 'W') {
                                        sum++;
                                    }
                                }
                            }
                            else if ((n+m)%2 == 1) {
                                if (k == 0) {
                                    if (ch[m] != 'W') {
                                        sum++;
                                    }
                                }
                                else if (k == 1) {
                                    if (ch[m] != 'B') {
                                        sum++;
                                    }
                                }
                            }
                        }
                    }
                    if (r > sum) {
                        r = sum;
                    }
                }
            }
        }

        return r;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] arr = new String[y];
        for (int i = 0; i < y; i++) {
            arr[i] = br.readLine();
        }
        System.out.println(solution(arr, x, y));
    }
}