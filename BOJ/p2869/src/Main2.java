import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt() - A;
        int K = A - B;

        System.out.println(V % K != 0 ? V / K + 2 : V / K + 1);
    }
}