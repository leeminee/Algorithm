package Level8.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1; // 최소경로 수
        int min = 2; // 범위의 최소값
        br.close();

        if (n == 1) {
            System.out.println(1);
        } else {
            while (n >= min) {
                min = min + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}
