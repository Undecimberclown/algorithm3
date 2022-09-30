/**
 * 
 * 출장비 지급표
 * 
 **********************************************************
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
        System.out.println("이름을 입력하세요;");
        String name = scanner.nextLine();
        System.out.println("금액을 입력하세요;");
        int money = scanner.nextInt();
        int expense = money;
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int mok = 0;
        int nmg = 0;
        for(int i = 0; i < unit.length; i++){
            mok = money / unit[i];
            nmg = money % unit[i];
            money = nmg;
            result += mok + "\t";
        }
        String answer = String.format(
        "**************************************************************************\n"
        + "성명 출장비  오만원   만원   오천원   천원   오백원   백원   오십원   십원\n"
        + "**************************************************************************\n"
        + "%s %d %s\n"
        + "**************************************************************************\n", name, expense, result);
        return title + answer;
    } 
}
