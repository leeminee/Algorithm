package Level7.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의개수_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        if(s.isEmpty()){
            System.out.println(0);
        } else {
            System.out.println(s.split(" ").length);
        }
    }
}
