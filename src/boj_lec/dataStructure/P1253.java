package src.boj_lec.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class P1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //갯수
        int N = Integer.parseInt(br.readLine());
        //숫자
        st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //오름차순 정렬
        Arrays.sort(arr);

        int count = 0; //좋은 수 개수
        int start = 0;
        int end = N;

        while(start < end){
            if(arr[start] + arr[end-2] < arr[end-1]){
                end--;
            }else if(arr[start] + arr[end-1] > end){
                start++;
            }else{
                count++; start++; end--;
            }
        }

        System.out.println(count);




    }
}
