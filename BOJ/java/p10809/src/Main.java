import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] s = br.readLine().toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < s.length; i++) {
            if (arr[s[i] - 97] == -1) {
                arr[s[i] - 97] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}