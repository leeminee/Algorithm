package Level5.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최소최대_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] a = new int[count];
        int index = 0;
        while(st.hasMoreTokens()){
            a[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        br.close();
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[count-1]);
    }
}
