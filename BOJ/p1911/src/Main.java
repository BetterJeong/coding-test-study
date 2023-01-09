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
        int r = 0;

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

        // 겹치는 부분 합치기
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i)[1] >= arr.get(i+1)[0] && arr.get(i)[1] <= arr.get(i+1)[1]
                    || arr.get(i+1)[1] >= arr.get(i)[0] && arr.get(i+1)[1] <= arr.get(i)[1] ) {
                arr.get(i)[0] = min(arr.get(i)[0], arr.get(i+1)[0]);
                arr.get(i)[1] = max(arr.get(i)[1], arr.get(i+1)[1]);
                arr.remove(i+1);
            }
        }

//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println("start: " + arr.get(i)[0] + " end: " + arr.get(i)[1]);
//        }

        // 첫 물 웅덩이부터 판자 깔기 시작
        int start = arr.get(0)[0];
        int count = 0;

        // 판자 수 계산
        for (int[] water : arr) {
            int length = 0;

//            count++;
//            System.out.println(count + "번 째 반복");

            // 먼저 쌓은 판자가 범위 안에 있을 때
            if (water[0] <= start && water[1] > start) {
                start++;    // 쌓인 판자 다음 좌표부터 깔기 위해
                length = water[1] - start;
            }
            // 범위 안에 없거나 바로 앞까지 깔았을 때
            else { //  if (water[0] <= done)
                length = water[1] - water[0];
                start = water[0];
            }

//            System.out.println("start: "+start);

            // 판자 깔기
            if (length % l != 0) {
                // 나머지가 있으면 하나 더 깔기
                start = start + (length/l + 1) * l - 1;
                r += length/l + 1;
            }
            else {
                // 나머지 없으면 끝에 맞춰서 깔기
                start = water[1];
                r += length/l;
            }

//            System.out.println("done: " + start);
//            System.out.println("판자 수: " + r);
        }

        System.out.println(r);
    }
}