package src.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMaxAlgo {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int temp;
        for(int i=0;i<n;i++) {
            temp=Integer.parseInt(st.nextToken());
            if(max<temp) {
                max=temp;
            }
            if(min>temp) {
                min=temp;
            }
        }
        System.out.print(min+" "+max);

    }

}