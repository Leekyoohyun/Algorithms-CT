package src.boj_lec.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //시험 본 과목 개수 N
        int N = Integer.parseInt(br.readLine());

        //현재 성적 ex 40 80 60
        String str = br.readLine();

        //배열에 저장
        String[] list = str.split(" ");

        int max = 0;

        for(int i=0; i< list.length; i++){

            if(Integer.parseInt(list[i]) > max){
                max = Integer.parseInt(list[i]);
            }
        }
        double[] listDouble = new double[list.length];
        for(int i=0; i< list.length; i++){
            listDouble[i] = (Double.parseDouble(list[i])/max * 100);
        }

        double sum = 0;
        for(int i=0; i< list.length; i++){
            sum += listDouble[i];
        }
        System.out.println(sum/ list.length);

    }
}
