package src.leets.strings;

import java.util.Arrays;

//문자열 뒤집기 인데, 출력하지말고 배열 내부 값만 바꿔라.

public class Reverses {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end){
            //임시 변수로 값 스왑
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            //가운데서 만나자?
            start++;
            end--;
        }
    }


}
