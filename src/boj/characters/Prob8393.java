package src.boj.characters;

import java.io.*;
import java.util.*;

public class Prob8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
