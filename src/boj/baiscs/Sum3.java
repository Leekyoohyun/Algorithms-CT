package src.boj.baiscs;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();



        for(int i = 0; i<a; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x+y);
        }
    }
}
