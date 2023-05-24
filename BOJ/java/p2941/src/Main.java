import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String str[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (int i = 0; i < str.length; i++) {
            if (st.contains(str[i])) {
                st = st.replace(str[i], "1");
            }
        }

        System.out.println(st.length());
    }
}