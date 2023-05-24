import java.io.*;
import java.util.Arrays;
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
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());
            int first = 0;
            int mid = 0;
            int last = arr.length - 1;
            boolean b = false;
            while (first <= last){
                mid = (first + last) / 2;
                if (k == arr[mid]) {
                    b = true;
                    break;
                }
                else if (k > arr[mid]) {
                    first = mid + 1;
                }
                else {
                    last = mid - 1;
                }
            }
            if (b) {
                bw.write("1 ");
            }
            else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}