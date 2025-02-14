package src.boj.characters;

import java.io.*;
import java.util.*;

public class Prob10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        String str = br.readLine();

        String[] list = str.split(" ");
        int[] arr = new int[list.length];

        for(int i=0; i<list.length; i++) {
            arr[i] = Integer.parseInt(list[i]);
        }

        Arrays.sort(arr);

        System.out.println(arr[0]+" "+arr[arr.length-1]);



    }
}
