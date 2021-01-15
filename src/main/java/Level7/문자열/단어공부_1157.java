package Level7.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] arr = new int[26]; // a ~ z
        for (int i = 0; i < s.length(); i++) {
            for (char j = 'a'; j < 'z'; j++) {
                arr[s.charAt(i) - 65]++; // A = 65 / a = 97
            }
        }

        int max = -1;
        char output = '?';

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                output = (char) (i+65);
            } else if ( arr[i] == max) {
                output = '?';
            }
        }
        System.out.println(output);
    }
}
