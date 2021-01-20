package Level8.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int width, high, number;
        int frontNumber;
        int backNumber;
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine()," ");
            high = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            number = Integer.parseInt(st.nextToken());
            frontNumber = (number%high) *100;


        }
        br.close();



    }
}
