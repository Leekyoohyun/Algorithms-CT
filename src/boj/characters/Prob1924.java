package src.boj.characters;

/*오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Prob1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] list = input.split(" ");

        LocalDate date = LocalDate.of(2007, Integer.parseInt(list[0]), Integer.parseInt(list[1]));

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if(dayOfWeek.getValue() == 1){
            System.out.println("MON");
        } else if (dayOfWeek.getValue() == 2) {
            System.out.println("TUE");
        } else if (dayOfWeek.getValue() == 3) {
            System.out.println("WED");
        } else if (dayOfWeek.getValue() == 4) {
            System.out.println("THU");
        } else if (dayOfWeek.getValue() == 5) {
            System.out.println("FRI");
        } else if (dayOfWeek.getValue() == 6) {
            System.out.println("SAT");
        } else if (dayOfWeek.getValue() == 7) {
            System.out.println("SUN");
        }

    }
}
