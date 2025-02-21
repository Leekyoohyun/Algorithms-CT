package src.boj_lec.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P28278_solution {

    static LinkedList<Integer> stack = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 명령어의 수

        while(n-->0) {
            solution(br.readLine());
        }
        br.close();
        System.out.println(sb);
    }

    static void solution(String query) {
        char c = query.charAt(0); // 첫번째 문자는 명령어
        switch (c) {
            case '1':
                stack.push(Integer.parseInt(query.substring(2)));
                return;
            case '2':
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
                return;
            case '3':
                sb.append(stack.size()).append('\n');
                return;
            case '4':
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                return;
            case '5':
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
                return;
            default:
                break;
        }
    }
}
