package src.boj_lec.bigO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N개의 수를 받겠다
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        //O(n)
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //O(n)
        Arrays.sort(arr);

        //출력
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}
