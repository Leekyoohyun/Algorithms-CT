package src.boj_lec.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P2164 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1){
            queue.poll(); //맨 앞 원소 버리기
            queue.offer(queue.poll()); // 버려진 원소 맨 뒤에 넣기
        }

        System.out.println(queue.poll()); // 마지막 원소
    }
}
