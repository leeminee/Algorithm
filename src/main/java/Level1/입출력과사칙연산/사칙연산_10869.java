package Level1.입출력과사칙연산;

import java.util.Scanner;

public class 사칙연산_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 1){
            System.out.println("첫번째 숫자는 1보다 크거나 같아야합니다.");
            return;
        }
        int b = sc.nextInt();
        if(b > 10000){
            System.out.println("두번째 숫자는 10,000보다 작거나 같아야합니다.");
            return;
        }
        sc.close();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
