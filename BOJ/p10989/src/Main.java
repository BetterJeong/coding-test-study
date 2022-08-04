import java.io.*;

public class Main {
    public static int[] arr;
    public static int[] cnt;
    public static int[] r;
    public static void solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++;
        }
        for (int i = 0; i < 10000; i++) {
            cnt[i+1] += cnt[i];
        }
        for (int i = n-1; i >= 0; i--) {
            r[--cnt[arr[i]]] = arr[i];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        cnt = new int[10001];
        r = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10001; i++) {
            cnt[i] = 0;
        }
        solution(n, arr);
        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(r[i]));
            bw.write("\n");
        }
        bw.close();
    }
}