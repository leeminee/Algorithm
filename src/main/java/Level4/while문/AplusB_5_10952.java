package Level4.while문;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AplusB_5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int i = 0;
        boolean check = true;
        List result = new LinkedList();

        //내가 푼 방법
//        while (check) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            if (a == 0 && b == 0) {
//                check = false;
//            } else {
//                result.add(i, a + b);
//                i++;
//            }
//        }

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            result.add(i, a + b);
            i++;
        }

        for (int j = 0; j < result.size(); j++) {
            System.out.println(result.get(j));
        }
    }
}
