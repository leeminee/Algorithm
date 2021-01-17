package Level7.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < testCase; i++) {
            if (check(br.readLine()))
                count++;
        }

        System.out.println(count);
    }

    public static boolean check(String s) {
        boolean[] arr = new boolean[26];
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            if (prev != now) {
                // 현재문자가 처음 나온경우
                if (!arr[now - 'a']) {
                    arr[now - 'a'] = true;
                    prev = now;
                }
                // 현재문자가 이전에 나왔던 경우(그룹단어X)
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
