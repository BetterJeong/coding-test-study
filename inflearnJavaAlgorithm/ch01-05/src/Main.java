import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.isLetter;

public class Main {
    public static String solution(String str) {
        String r = "";
        int[] index = new int[0];
        int i = 0;
        char[] ch = str.toCharArray();

        for (int j = ch.length - 1; j >= 0; j--) {
            if (isLetter(ch[j])) {
                r += ch[j];
            }
            else {
                index[i] = j;
                i++;
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append(r);
        for(int j = 0; j < index.length; j++) {
            sb.insert(index[j], ch[index[j]]);
        }

        return r;
    }
    public static void main(String[] args) throws IOException {
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        System.out.println(solution(str));
    }
}