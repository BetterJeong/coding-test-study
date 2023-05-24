import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            char[] ch = str.toCharArray();
            Stack<Character> stack = new Stack<>();

            if (str.equals(".")) {
                break;
            }

            for (char c : ch) {
                if (c == '.') {
                    if (stack.isEmpty()) {
                        System.out.println("yes");
                    }
                    else {
                        System.out.println("no");
                    }
                }
                else if (c == '(' || c == '[') {
                    stack.add(c);
                }
                else if (c == ')' || c ==']') {
                    if (stack.isEmpty()) {
                        System.out.println("no");
                        break;
                    }
                    else {
                        char p = stack.pop();
                        if ((c == ')' && p != '(') || (c == ']' && p != '[')) {
                            System.out.println("no");
                            break;
                        }
                    }
                }
            }
        }
    }

}