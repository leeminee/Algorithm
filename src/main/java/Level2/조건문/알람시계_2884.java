package Level2.조건문;

import java.util.Scanner;

public class 알람시계_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

//        if(hour == 0) {
//            if(minute < 45){
//                hour = 23;
//                minute += 15;
//            } else {
//                minute -= 45;
//            }
//        } else {
//            if(minute < 45){
//                hour -= 1;
//                minute += 15;
//            } else {
//                minute -= 45;
//            }
//        }

        if(minute < 45){
            hour -= 1;
            minute += 15;
        } else {
            minute -= 45;
        }

        if(hour < 0){
            hour += 24;
        }

        System.out.println(hour +" "+minute);
    }
}
