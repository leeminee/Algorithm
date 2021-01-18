package Level8.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 손익분기점_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int fixedMoney = Integer.parseInt(st.nextToken());
        int activeMoney = Integer.parseInt(st.nextToken());
        int realMoney = Integer.parseInt(st.nextToken());
        br.close();

        if(realMoney<=activeMoney) {
            System.out.println("-1");
        } else {
            System.out.println((fixedMoney/(realMoney-activeMoney))+1);
        }
    }
}
