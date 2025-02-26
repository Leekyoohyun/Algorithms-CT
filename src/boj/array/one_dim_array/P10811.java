package src.boj.array.one_dim_array;

import java.io.*;
import java.util.StringTokenizer;

public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N+1];
        for(int x = 1; x <= N; x++){
            array[x] = x;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            while(start < end){
                int temp = array[start];
                array[start++] = array[end];
                array[end--] = temp;
            }
        }

        for(int i=1; i<=N; i++){
            bw.write(array[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
