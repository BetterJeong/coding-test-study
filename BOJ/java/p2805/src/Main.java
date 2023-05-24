import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> arr = new ArrayList<>();
        long start = 0;
        long mid = 0;
        long end = 0;
        long sum = 0;
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(arr);  // 정렬된 상태여야 이분 탐색 가능

        // 시작, 끝 값 지정
        start = 0;
        end = arr.get(arr.size() - 1);

        while (start < end -1) {    // start 와 end 가 2 차이 날 때까지 돌아야 함 start (중간값) end
            mid = (start + end) / 2;    // 중간 값으로 계산
            sum = 0;

            for (Long l : arr) {    // 중간 값보다 큰 값에 대해 나무 자르기, 자른 나무 길이 합산
                if (l > mid) {
                    sum += l - mid;
                }
            }

            if (sum == M) { // 목표만큼 자르면 끝내기
                start = mid;
                break;
            }
            else if (sum > M) { // 목표보다 많이 잘랐으면 start 에 저장
                start = mid;
            }
            else {  // 목표보다 조금 잘랐으면 end 에 저장
                end = mid;
            }
        }

        System.out.println(start);
    }
}