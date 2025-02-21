package src.boj_lec.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(st1.nextToken()));
        }
        Collections.sort(list);
        System.out.println(list.get(N-k));

    }
}
