import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
    public static int[] d = {8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        char c = 'm';

        for (int i = 0; i < 8; i++) {
            if (arr[i] != a[i]) {
                break;
            }
            if (i == 7) {
                c = 'a';
            }
        }

        for (int i = 0; i < 8; i++) {
            if (arr[i] != d[i]) {
                break;
            }
            if (i == 7) {
                c = 'd';
            }
        }

        switch (c) {
            case 'a':
                System.out.println("ascending");
                break;
            case 'd':
                System.out.println("descending");
                break;
            case 'm':
                System.out.println("mixed");
                break;
        }
    }
}