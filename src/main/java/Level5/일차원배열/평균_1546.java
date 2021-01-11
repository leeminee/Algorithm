package Level5.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 평균_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] originalScore = new double[Integer.parseInt(br.readLine())];
        double newAvgScore = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < originalScore.length; i++) {
            originalScore[i] = Double.parseDouble(st.nextToken());
        }
        br.close();
        Arrays.sort(originalScore);

        for (int i = 0; i < originalScore.length; i++) {
            newAvgScore += originalScore[i]/originalScore[originalScore.length-1]*100;
        }
        System.out.println(newAvgScore/originalScore.length);

    }
}
