package src.boj_lec.sorting;

/* https://www.acmicpc.net/problem/1427 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1427 {

    // 첫번째 풀이
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] list = str.split("");

        int[] arr = new int[str.length()];
        for(int i = 0; i < list.length; i++){
            arr[i] = Integer.parseInt(list[i]);
        }

        Arrays.sort(arr);

        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + "");
        }
    }*/

    //근데 위에꺼가 더 빠른데?

    // selection sort 쓰기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] A = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }
        //선택정렬
        for(int i=0; i<str.length(); i++) {
            int Max = i;
            for(int j = i+1; j<str.length(); j++) {
                if(A[Max] < A[j]) {
                    Max = j;
                }
            }
            if(A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }

        for(int i : A){
            System.out.print(i);
        }
    }

}
