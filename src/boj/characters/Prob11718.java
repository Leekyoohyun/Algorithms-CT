package src.boj.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob11718 {
    public static void main(String[] args) throws IOException {
        /* 그대로 출력하기 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while (true) {

            if((str = br.readLine()) == null){
                break;
            }else{
                System.out.println(str);
            }
        }
    }
}
