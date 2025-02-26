package src.boj.array.one_dim_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] check = new boolean[31];

        for(int i=1; i<29; i++){
            int number = Integer.parseInt(br.readLine());
            check[number] = true;
        }

        for(int i=1; i<31; i++){
            if(!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);

    }
}
