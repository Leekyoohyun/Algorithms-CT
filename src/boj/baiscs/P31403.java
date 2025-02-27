package src.boj.baiscs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();


        //수로 생각
        System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
        //문자열로생각
        System.out.println(Integer.parseInt(A+B)-Integer.parseInt(C));
    }
}
