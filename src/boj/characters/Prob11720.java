package src.boj.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String number = br.readLine();

        int N = Integer.parseInt(str);

        String[] list = number.split("");
        //54321
        int sum = 0;
        for(String s : list) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

    }
}
