package Level3.for문;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AplusB_3_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();

        int a = 0;
        int b = 0;
        List result = new LinkedList<Integer>();

        for (int i = 0; i < lineCount; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            result.add(i,a+b);
        }
        sc.close();

        for (int i = 0; i < lineCount; i++) {
            System.out.println(result.get(i));
        }

    }
}
