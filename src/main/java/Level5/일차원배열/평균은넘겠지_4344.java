package Level5.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score;

        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer studentCountAndScore;

        for (int i = 0; i < testCase; i++) {

            studentCountAndScore = new StringTokenizer(br.readLine(), " ");

            int studentCount = Integer.parseInt(studentCountAndScore.nextToken());
            score = new int[studentCount];

            double sum = 0;

            for (int j = 0; j < studentCount; j++) {
                score[j] = Integer.parseInt(studentCountAndScore.nextToken());
                sum += score[j];
            }

            double avgScore = sum/studentCount;
            double avgOverStudentCount = 0;

            for (int j = 0; j < studentCount; j++) {
                if(score[j] > avgScore){
                    avgOverStudentCount++;
                }
            }
            System.out.printf("%.3f%%\n",(avgOverStudentCount/studentCount)*100);

        }
    }
}
