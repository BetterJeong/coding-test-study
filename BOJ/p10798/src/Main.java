import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][];
        int max = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine().toCharArray();
            if (arr[i].length > max) max = arr[i].length;
        }

        int i = 0;

        while (i < max) {
            for (int j = 0; j < 5; j++) {
                if (i < arr[j].length) sb.append(arr[j][i]);
            }

            i++;
        }

        System.out.println(sb);
    }
}