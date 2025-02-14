package src.boj.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] list = input.split("");

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]);
            if(i % 10 == 9){
                System.out.println();
            }

        }
    }
}
