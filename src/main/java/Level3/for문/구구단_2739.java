package Level3.for문;

import java.util.Scanner;

public class 구구단_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i=1; i<10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
