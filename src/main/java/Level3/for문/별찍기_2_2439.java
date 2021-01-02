package Level3.for문;

import java.util.Scanner;

public class 별찍기_2_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();
        sc.close();
        String s = "*";
        int space = 0;
        for (int i = 1; i <= lineCount; i++) {
            space = lineCount-i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.print(s);
            System.out.println();
            s += "*";
        }
    }
}
