package src.leets.strings;

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        //비교 메소드 위해 Set으로
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        //각 단어별 개수가 저장 될 key-value Map
        Map<String, Integer> count = new HashMap<>();

        //대소문자, 공백, 쉼표 등 무시하게
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for(String w : words){
            //금지된 단어가 아닌 경우 개수 처리
            if(!ban.contains(w)){
                //존재하지 않는 단어면 기본값 0, 추출한 값에 +1 하여 저장
                count.put(w, count.getOrDefault(w,0)+1);
            }
        }

        //가장 흔하게 나오는 단어 추출
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
