import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            hashMap.put(String.valueOf(i), s);
            hashMap.put(s, String.valueOf(i));
        }
        for (int i = 1; i <= m; i++) {
            bw.write(hashMap.get(br.readLine())+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}