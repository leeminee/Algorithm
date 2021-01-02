package Level3.for문;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AplusB_7_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();
        int a,b;
        List result = new LinkedList();
        for (int i = 0; i < lineCount; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            result.add(i,a+b);
        }
        for (int i = 1; i <= lineCount; i++) {
            System.out.println("Case #"+i+": "+result.get(i-1));
        }
    }
}
