package src.leets.strings;

import java.util.*;

public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        //애너그램 결과를 보관하기 위한 Map
        Map<String, List<String>> results = new HashMap<>();

        //문자열 배열 순회
        for(String s : strs){
            //문자열을 문자 배열로 변환
            char[] chars = s.toCharArray();
            //문자 배열 정렬
            Arrays.sort(chars);
            //문자 배열을 Key로 하기 위해 문자열로 다시 변환
            String key = String.valueOf(chars);

            //만약 기존에 없는 키라면?
            if(!results.containsKey(key))
                results.put(key, new ArrayList<>());
            //키에 해당하는 리스트에 추가
            results.get(key).add(s);
        }

        return new ArrayList<>(results.values());
    }
}
