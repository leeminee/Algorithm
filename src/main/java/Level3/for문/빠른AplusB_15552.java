package Level3.for문;

import java.io.*;
import java.util.StringTokenizer;

public class 빠른AplusB_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lineCount = Integer.parseInt(br.readLine());

        int a,b;
        StringTokenizer tokenizer;
        for (int i = 0; i < lineCount; i++) {
            tokenizer = new StringTokenizer(br.readLine()," ");
            bw.write(Integer.parseInt(tokenizer.nextToken())+ Integer.parseInt(tokenizer.nextToken())+"\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
