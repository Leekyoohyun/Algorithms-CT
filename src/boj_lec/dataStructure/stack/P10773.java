package src.boj_lec.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        int sum = 0;

        while(K-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                sum -= stack.pop();
            }else{
                stack.push(num);
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
