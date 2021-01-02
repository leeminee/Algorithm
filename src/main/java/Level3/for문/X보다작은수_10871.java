package Level3.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        String secondLine =  br.readLine();
        br.close();
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(firstLine," ");
        int N = Integer.parseInt(tokenizer.nextToken());
        int X = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(secondLine, " ");

        for (int i = 0; i < N; i++) {
            int result = Integer.parseInt(tokenizer.nextToken());
            if(result < X){
                System.out.print(result+" ");
            }
        }
    }
}
