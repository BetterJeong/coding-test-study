import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        ArrayList<int[]> arr = new ArrayList<>();
        int wood = 0;   // 쌓은 판자 길이
        int r = 0;  // 판자 수

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        // 오름차순 정렬
        arr.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[1];
            }
        });

        // 판자 수 계산
        for (int[] water : arr) {
            if (wood < water[0]) wood = water[0];   // 웅덩이가 새로 시작하면

            while (wood < water[1]) {   // 웅덩이를 다 채우거나 넘길 때까지 판자 깔기
                wood += l;
                r++;
            }
        }

        System.out.println(r);
    }
}