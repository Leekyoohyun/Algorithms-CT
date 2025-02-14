package src.boj.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
*   A가 B보다 큰 경우에는 '>'를 출력한다.
    A가 B보다 작은 경우에는 '<'를 출력한다.
    A와 B가 같은 경우에는 '=='를 출력한다.
*/
public class Prob1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        short A = Short.parseShort(st.nextToken());
        short B = Short.parseShort(st.nextToken());

        if(A > B){
            System.out.println(">");
        }else if(A < B){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
