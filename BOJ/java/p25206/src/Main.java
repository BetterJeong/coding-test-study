import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static double grade;
    static double credit;

    public static double getGrade(double c, String s) {
        double g = 0;
        if (s.equals("P")) g = 0;
        else {
            if (s.equals("A+")) g = 4.5;
            if (s.equals("A0")) g = 4.0;
            if (s.equals("B+")) g = 3.5;
            if (s.equals("B0")) g = 3.0;
            if (s.equals("C+")) g = 2.5;
            if (s.equals("C0")) g = 2.0;
            if (s.equals("D+")) g = 1.5;
            if (s.equals("D0")) g = 1.0;
            if (s.equals("F")) g = 0;

            credit += c;
        }
        return c * g;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        grade = 0;
        credit = 0;

        for (int t = 0; t < 20; t++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            grade += getGrade(Double.parseDouble(st.nextToken()), st.nextToken());
        }

        System.out.println(grade / credit);
    }
}