package Level1.입출력과사칙연산;

import java.util.Scanner;

public class 곱셈_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        System.out.println(Integer.parseInt(a)* Character.getNumericValue(b.charAt(2)));
        System.out.println(Integer.parseInt(a)* Character.getNumericValue(b.charAt(1)));
        System.out.println(Integer.parseInt(a)* Character.getNumericValue(b.charAt(0)));
        System.out.println(Integer.parseInt(a)* Integer.parseInt(b));
    }
}
