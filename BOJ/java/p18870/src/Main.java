import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i : arr) {
            tmp.add(i);
        }
        Collections.sort(tmp);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (!hashMap.containsKey(tmp.get(i))) {
                hashMap.put(tmp.get(i), k);
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(hashMap.get(arr[i])));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
    }
}