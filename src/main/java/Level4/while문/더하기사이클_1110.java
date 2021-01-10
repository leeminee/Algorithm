package Level4.while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클_1110 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int copy = number;
//        int cnt = 0;
//
//        do{
//            cnt++;
//            number = (number%10)*10 + (number/10 + number%10)%10;
//        } while(number != copy) ;
//        System.out.println(cnt);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int copy = number;
        int cnt = 0;

        do{
            cnt++;
            number = (number%10)*10 + (number/10 + number%10)%10;
        } while(number != copy) ;
        System.out.println(cnt);
    }
}
