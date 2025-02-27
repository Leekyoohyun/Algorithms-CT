package src.boj.baiscs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int number = A * B * C;

        int count0=0; int count1=0; int count2=0; int count3=0; int count4=0;
        int count5=0; int count6=0; int count7=0; int count8=0; int count9=0;

        String numberString = Integer.toString(number);

        for(int i=0; i<numberString.length(); i++){
            switch(numberString.charAt(i)){
                case '0': count0++;
                    break;
                case '1': count1++;
                    break;
                case '2': count2++;
                    break;
                case '3': count3++;
                    break;
                case '4': count4++;
                    break;
                case '5': count5++;
                    break;
                case '6': count6++;
                    break;
                case '7': count7++;
                    break;
                case '8': count8++;
                    break;
                case '9': count9++;
                    break;
            }
        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);
        System.out.println(count9);
    }
}
