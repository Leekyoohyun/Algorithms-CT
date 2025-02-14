package src.boj.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2439 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0 ; k<n+1-i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
