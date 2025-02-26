package src.boj.baiscs;

import java.io.*;
import java.util.StringTokenizer;

public class P2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(st.nextToken());
            sum += number*number;
        }
        System.out.println(sum%10);
    }
}
