package Level7.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(i<=s.length()-2) {
                if (s.charAt(i) == 'c') {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    } else if (s.charAt(i + 1) == '-') {
                        i++;
                    }
                } else if (s.charAt(i) == 'l' || s.charAt(i) == 'n') {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                } else if (s.charAt(i) == 's' || s.charAt(i) == 'z') {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                } else if(s.charAt(i)=='d') {
                    if(s.charAt(i+1)=='-'){
                        i++;
                    }
                }
            }

            if (i<=s.length()-3) {
                if (s.charAt(i) == 'd') {
                    if (s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
