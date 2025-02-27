package src.boj.baiscs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= 45; i++){
            M--;
            if(H>0 && H<24) {
                if (M < 0) {
                    H--;
                    M = 59;
                }
            }else if(H==0){
                if(M<0){
                    H=23;
                    M=59;
                }
            }
        }
        System.out.println(H + " " + M);
    }
}
