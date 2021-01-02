package Level1.입출력과사칙연산;

import java.util.Scanner;

public class AminusB_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 0){
            System.out.println("A(첫번째 숫자)는 0보다 커야합니다.");
            return;
        }
        int b = sc.nextInt();
        if(b >= 10){
            System.out.println("B는 10보다 작아야합니다.");
            return;
        }
        sc.close();
        System.out.println(a-b);
    }
}
