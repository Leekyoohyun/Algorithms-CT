package src.boj.baiscs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<=T; i++) {
            int current = 0;
            int sum = 0;
            String ox = br.readLine();
            for(int j = 0; j < ox.length(); j++) {
                if(ox.charAt(j) == 'O') {
                    current++;
                    sum += current;
                }else if(ox.charAt(j) == 'X') {
                    current = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
