public class Main {
    public static int d(int n) {
        int r = n;

        while (n != 0) {
            r += (n % 10);
            n /= 10;
        }

        return r;
    }

    public static void main(String[] args) {

        boolean[] b = new boolean[10001];

        for (int i = 0; i < 10001; i++) {
            int k = d(i);

            if (k < 10001) {
                b[k] = true;
            }
        }

        for (int i = 0; i < 10001; i++) {
            if (b[i] != true) {
                System.out.println(i);
            }
        }
    }
}