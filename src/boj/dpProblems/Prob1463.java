package src.boj.dpProblems;

/*
    정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

    X가 3으로 나누어 떨어지면, 3으로 나눈다.
    X가 2로 나누어 떨어지면, 2로 나눈다.
    1을 뺀다.

    정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob1463 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i = 0;
        while(true){
            if(N==1) {
                break;
            } else if(N % 3 == 0){
                N = N / 3;
                i++;
            }else if(N % 2 == 0){
                N = N / 2;
                i++;
            }else{
                N = N-1;
                i++;
            }
        }
        System.out.println(i);
    }
}
