package src.strings;
import java.util.Arrays;

public class SortStrings {
    public static int[] solution(String my_string) {


        int i= 0;
        String newString = my_string.replaceAll("[a-z]","");
        String[] arr = newString.split("");
        int[] answer = new int[newString.length()];
        for(String s : arr){
            answer[i] = Integer.parseInt(s);
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("sd8das9dasfaas9989saf8")));
    }
}
