package src.boj.baiscs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 층 수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님인지

            // 호텔의 방을 나타내는 배열 (1부터 시작하므로 H+1, W+1 크기로 생성)
            int[][] hotel = new int[H + 1][W + 1];

            // 방 배정 (1층부터 차례로 배정)
            int guestCount = 0;
            int assignedH = 0, assignedW = 0;

            outerLoop:
            for (int w = 1; w <= W; w++) { // 방 번호(가로)
                for (int h = 1; h <= H; h++) { // 층 번호(세로)
                    guestCount++;
                    if (guestCount == N) {
                        assignedH = h;
                        assignedW = w;
                        break outerLoop; // 손님 배정이 끝났으므로 종료
                    }
                }
            }

            // 방 번호 생성 (층수 + 방 번호(두 자리))
            sb.append(assignedH);
            if (assignedW < 10) {
                sb.append("0");
            }
            sb.append(assignedW).append("\n");
        }
        System.out.println(sb);
    }
}
