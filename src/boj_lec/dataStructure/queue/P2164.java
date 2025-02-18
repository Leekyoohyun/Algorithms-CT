package src.boj_lec.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/* https://www.acmicpc.net/problem/2164 */

public class P2164 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            queue.offer(i); // 큐에 넣어
        }
        while (queue.size() > 1){ // 큐에 하나 남을때까지
            queue.poll(); //맨 앞 원소 버리기
            queue.offer(queue.poll()); // 그 다음에 버리면서 동시에 맨 뒤에 넣기
        }

        System.out.println(queue.poll()); // 마지막 원소 빼기!
    }
}
