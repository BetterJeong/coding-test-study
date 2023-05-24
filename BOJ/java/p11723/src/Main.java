import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("all")) for (int j = 1; j <= 20; j++) S[j] = true;
            else if (str.equals("empty")) for (int j = 1; j <= 20; j++) S[j] = false;
            else {
                int x = Integer.parseInt(st.nextToken());

                if (str.equals("add")) S[x] = true;
                else if (str.equals("remove")) S[x] = false;
                else if (str.equals("check")) bw.write(S[x] ? "1\n" : "0\n");
                else if (str.equals("toggle")) S[x] = S[x] ? false : true;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}