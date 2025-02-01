package src.leets.strings;

//LeetCode 125: 팰린드롬
//뒤집어도 똑같나

public class Palindrome {
    public boolean isPalindrome(String s) {

        //시작 지점, 끝 지점 정하기
        int start = 0;
        int end = s.length() - 1;

        //중앙으로 이동하다가 겹치는 지점에 도달 시 종료
        while(start < end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else{
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                //앞쪽 문자는 한칸 뒤로, 뒤쪽은 앞으로
                start++;
                end--;
            }
        }
        return true;
    }
}
