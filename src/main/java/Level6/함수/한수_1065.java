package Level6.함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        System.out.println(checkNumber(number));

    }

    public static int checkNumber(int number) {
        int count = 0;

        if(number < 100) {
            return number;
        } else {
            count = 99;
            if(number==1000){
                number = 999;
            }
            for (int i = 100; i <= number; i++) {
                int hundred = i/100;
                int ten = (i/10)%10;
                int one = i%10;

                if((hundred-ten) == (ten-one)){
                    count++;
                }
            }

        }

        return count;
    }
}
