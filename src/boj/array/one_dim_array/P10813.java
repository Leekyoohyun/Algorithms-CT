package src.boj.array.one_dim_array;

import java.io.*;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N+1];
        for(int i=0; i<=N; i++){
            array[i] = i;
        }
        int temp=0;
        for(int x =0; x<M;x++){
            st = new StringTokenizer(br.readLine(), " ");
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for(int i=1; i<=N; i++){
            bw.write(array[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
