package src.boj_lec.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) { // 반복 횟수 수정
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) { // "1 X"일 경우
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (command == 2) { // "2"일 경우
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command == 3) { // "3"일 경우
                sb.append(stack.size()).append("\n");
            } else if (command == 4) { // "4"일 경우
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command == 5) { // "5"일 경우
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
