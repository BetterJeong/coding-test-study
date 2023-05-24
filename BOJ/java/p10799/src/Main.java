import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<String> st = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        str = br.readLine();

        int block = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push("(");
            }
            else if (str.charAt(i) == ')') {
                if (str.charAt(i-1) == '(') {
                    st.push(")");
                    block += st.indexOf(")")-1;
                    st.pop();
                    st.pop();
                }
                else {
                    st.pop();
                    block++;
                }
            }
        }

        System.out.println(block);
    }
}