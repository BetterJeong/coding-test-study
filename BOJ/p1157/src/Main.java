import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toUpperCase().toCharArray();
        int[] arr = new int[26];
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < ch.length; i++) {
            arr[ch[i]-65]++;
        }

        for(int i = 0; i < 26; i++) {
            if (arr[max] <= arr[i]) {
                max = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == arr[max]) {
                cnt++;
            }
        }

        if (cnt == 1) {
            System.out.println(Character.toString(max+65));
        }
        else {
            System.out.println("?");
        }
    }
}