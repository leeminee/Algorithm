package Level2.조건문;

import java.util.Scanner;

public class 오븐시계_2525 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int minute = sc.nextInt();
    int time = sc.nextInt();
    int sum;

    sum = minute+time;

    if(sum >= 60) {
      hour += sum / 60;
      minute = sum % 60;
      if(hour >= 24) {
        hour = hour % 24;
      }
    } else {
      minute = sum;
    }

    System.out.println(hour + " " + minute);
  }
}
