package Level5.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int  max = 0;
        int index = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }

        for (int value : arr) {
            count++;
            if(value > max) {
                max = value;
                index = count;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
