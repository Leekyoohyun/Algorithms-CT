package src.boj.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=N; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
