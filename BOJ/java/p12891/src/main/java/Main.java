import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P =  Integer.parseInt(st.nextToken());
        String s = br.readLine();
        int r = 0;

        int[] n = new int[4];
        int[] c = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < P; i++) {
            switch(s.charAt(i)) {
                case 'A':
                    c[0] += 1;
                    break;
                case 'C':
                    c[1] += 1;
                    break;
                case 'G':
                    c[2] += 1;
                    break;
                case 'T':
                    c[3] += 1;
                    break;
            }
        }

        if (check(n, c)) {
            r += 1;
        }

        for (int right = P; right < S; right++) {
            switch(s.charAt(right - P)) {
                case 'A':
                    c[0] -= 1;
                    break;
                case 'C':
                    c[1] -= 1;
                    break;
                case 'G':
                    c[2] -= 1;
                    break;
                case 'T':
                    c[3] -= 1;
                    break;
            }

            switch(s.charAt(right)) {
                case 'A':
                    c[0] += 1;
                    break;
                case 'C':
                    c[1] += 1;
                    break;
                case 'G':
                    c[2] += 1;
                    break;
                case 'T':
                    c[3] += 1;
                    break;
            }

            if (check(n, c)) {
                r += 1;
            }
        }

        bw.write(String.valueOf(r));
        bw.flush();
    }

    public static boolean check(int[] n, int[] c) {
        return n[0] <= c[0] && n[1] <= c[1] && n[2] <= c[2] && n[3] <= c[3];
    }
}
