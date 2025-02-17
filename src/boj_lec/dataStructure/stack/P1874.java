package src.boj_lec.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<Integer>();

        int N = Integer.parseInt(br.readLine()); // 갯수
        int start = 0;

        while(N --> 0){
            int value = Integer.parseInt(br.readLine());

            if(value > start){
                for(int i= start+1; i<=value; i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                System.exit(0);
            }

            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);


    }
}
