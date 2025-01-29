package src.strings;

public class ReverseStrings {
    public static String solution(String my_string) {
        StringBuffer str = new StringBuffer(my_string);
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello Java"));
    }
}
