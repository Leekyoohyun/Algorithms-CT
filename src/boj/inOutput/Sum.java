package src.boj.inOutput;

import java.util.Scanner;

//A+B 인데 스캐너 쓰면 느려, 그러면 어떻게?

// BufferedReader


public class Sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A+B);

        in.close();
    }
}
