package Level7.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int number;
        String word;
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            number = Integer.parseInt(st.nextToken());
            word = st.nextToken();
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < number; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
