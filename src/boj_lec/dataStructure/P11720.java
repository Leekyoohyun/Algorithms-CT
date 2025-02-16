package src.boj_lec.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        String[] list = str.split("");
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += Integer.parseInt(list[i]);
        }
        System.out.println(sum);
    }
}
