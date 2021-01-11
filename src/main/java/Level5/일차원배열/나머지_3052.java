package Level5.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 나머지_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num;
//        boolean[] arr = new boolean[42];
//        int count = 0;
//
//        for (int i = 0; i < 10; i++) {
//            num = Integer.parseInt(br.readLine());
//            arr[num%42] = true;
//        }
//
//        for (boolean value : arr) {
//            if(value){
//                count++;
//            }
//        }
//        System.out.println(count);

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hs.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(hs.size());
    }
}
