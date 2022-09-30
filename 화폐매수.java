/**
 * 
 * 출장비 지급표
 * 
 *******************************************************
 성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원
 *******************************************************
 홍길동 ### ### ### ### ### ### ### ### ##
 엄복동
 임꺽정
 *******************************************************
 */


import java.util.*;
class 화폐매수 {
    public static void main(String[] args) {
        화폐매수 solution = new 화폐매수();
        System.out.println(solution.solution());
    }
    public String solution(){
        String title =" ### 화폐 매수 ### \n";
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("금액을 입력하세요;");
        
        String answer = String.format(
        "*******************************************************\n"
        + "성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원\n"
        + "*******************************************************\n"
        + "%s"
        + "*******************************************************\n", result);
        return title + answer;
    } 
}
