package src.programmers.strings;

/*
* 암호화된 문자열 cipher를 주고받습니다.
* 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
*/

public class TranslateCipher {
    public static String solution(String cipher, int code) {
        /**
         * @param cipher - 암호화된 문자열
         * @param code - code의 배수 번째 문자만 진짜 문자
         **/
        String answer = "";
        String[] list = cipher.split("");
        for(int i=code-1; i< list.length; i += code){
            answer += list[i];

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk",2));
    }
}
