package src.boj_lec.dataStructure;

/*
    N : 재료의 개수
    M: 갑옷 만드는데 필요한 수
    세 번째 줄: 고유한 번호들
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i] + arr[j] == M){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
