package src.boj.inOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        String[] list = b.split("");

        System.out.println(Integer.parseInt(a) * Integer.parseInt(list[2]));
        System.out.println(Integer.parseInt(a) * Integer.parseInt(list[1]));
        System.out.println(Integer.parseInt(a) * Integer.parseInt(list[0]));
        System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
    }
}
