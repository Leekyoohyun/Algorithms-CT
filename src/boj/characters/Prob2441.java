package src.boj.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2441 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = N; i>0; i--){
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
