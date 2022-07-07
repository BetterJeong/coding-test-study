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

        return r;
    }

    public static void main(String[] args) throws IOException {
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        System.out.println(solution(str));
    }
}