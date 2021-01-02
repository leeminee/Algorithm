package Level3.for문;

import java.util.Scanner;

public class 별찍기_1_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();
        sc.close();
        String s = "*";

        // 내가 푼 방법
//        for (int i = 0; i < lineCount; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(s);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < lineCount; i++) {
            System.out.println(s);
            s += "*";
        }
    }
}
