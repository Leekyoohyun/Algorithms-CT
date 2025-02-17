package src.boj_lec.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int S = Math.abs(Integer.parseInt(st.nextToken())); //DNA 문자열 길이
        int P = Math.abs(Integer.parseInt(st.nextToken())); // 비밀번호 길이

        String dna = br.readLine(); //dna 문자 받기

        // 최소 개수
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int A_count = 0;
        int C_count = 0;
        int G_count = 0;
        int T_count = 0;

        int start = 0;
        int end = P-1;
        int count = 0;

        for(int i = 0; i<=end && end <= S; i++) {
            String password = dna.substring(start, end);
            if(password.charAt(i) == 'A'){
                A_count++;
            }else if(password.charAt(i) == 'C'){
                C_count++;
            }else if(password.charAt(i) == 'G'){
                G_count++;
            }else if(password.charAt(i) == 'T'){
                T_count++;
            }
            start++;
            end++;
        }
        if(A_count >= A && C_count >= C && G_count >= G && T_count >= T ){
            count++;
        }

        System.out.println(count);





    }
}
