import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[] ch = br.readLine().toCharArray();
        ArrayList<Character> result = new ArrayList<>();

        for (int i = ch.length-1; i >= 0; i--) {
            int size = result.size();

            if (size == 0 && isConsonant(ch[i])) {
                result.add(ch[i]);
            }
            else if ((size == 1 || size == 2) && ch[i] == 'A') {
                result.add(ch[i]);
            }
            else if (size > 2 && size < M) {
                result.add(ch[i]);
            }
        }

        if (result.size() != M) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
            for (int i = M-1; i >= 0; i--) {
                System.out.print(result.get(i));
            }
        }
    }

    public static boolean isConsonant(char c) {
        boolean b = true;

        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                b = false;
                break;
        }

        return b;
    }
}