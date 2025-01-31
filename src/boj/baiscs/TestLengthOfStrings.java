package src.boj.baiscs;

import java.util.Scanner;

public class TestLengthOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] list = s.split("");
        int count = 1;
        for(String str : list){
            if(str.equals(" ")){
                count++;
            }
        }

        System.out.println(count);
    }
}
