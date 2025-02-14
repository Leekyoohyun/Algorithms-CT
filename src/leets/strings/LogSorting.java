package src.leets.strings;

import java.util.*;

public class LogSorting {
    public String[] reorderLogFiles(String[] logs) {
        //문자 로그 리스트
        List<String> letterList = new ArrayList<>();
        //숫자 로그 리스트
        List<String> digitList = new ArrayList<>();

        for(String log : logs){
            //로그 종류 확인 후 분배
            if(Character.isDigit(log.split(" ")[1].charAt(0))){
                digitList.add(log);
            }else{
                letterList.add(log);
            }
        }

        //문자 리스트 정렬
        letterList.sort((s1,s2) -> {
            //식별자와 나머지
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);

            //문자록 사전 순 비교
            int compared = s1x[1].compareTo(s2x[1]);

            if(compared == 0){
                return s1x[0].compareTo(s2x[0]);
            }else{
                return compared;
            }
        });

        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);
    }
}
