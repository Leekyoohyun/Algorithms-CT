package src.boj_lec.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P10989 {
    public static void main(String[] args) throws IOException {
        //수의 범위 (1~10000) 0 제외
        int[] cnt = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            //해당 인덱스값 증가
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<10001; i++){

            while(cnt[i]>0){
                sb.append(i).append("\n");
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
