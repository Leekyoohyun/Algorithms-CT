package src.boj_lec.sorting;

/* https://www.acmicpc.net/problem/1427 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] list = str.split("");

        int[] arr = new int[str.length()];
        for(int i = 0; i < list.length; i++){
            arr[i] = Integer.parseInt(list[i]);
        }

        Arrays.sort(arr);

        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + "");
        }
    }
}
