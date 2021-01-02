package Level3.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB_8_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(sr.readLine());
        StringTokenizer tokenizer;
        for (int i = 1; i <= lineCount; i++) {
            tokenizer = new StringTokenizer(sr.readLine()," ");
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            System.out.println(String.format("Case #%d: %d + %d = %d",i,a,b,a+b));
        }
    }
}
