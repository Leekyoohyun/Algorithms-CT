package src.boj.array.one_dim_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrToFindMax = new int[10];

        arrToFindMax[0] = 0;
        int MAX = 0;
        int maxIndex = 0;

        for(int i = 1; i < arrToFindMax.length; i++) {
            arrToFindMax[i] = Integer.parseInt(br.readLine());
            if(arrToFindMax[i] > MAX){
                MAX = arrToFindMax[i];
                maxIndex = i;
            }
        }

        System.out.println(MAX);
        System.out.println(maxIndex);
    }
}
