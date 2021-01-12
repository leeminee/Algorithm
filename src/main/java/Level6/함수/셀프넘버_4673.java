package Level6.함수;

public class 셀프넘버_4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            int n = b(i);
            if(n < 10001) {
                arr[b(i)] = true; // 생성자가 있는 숫자를 true로 반환
            }
        }

        for (int i = 1; i < 10001; i++) {
            if(!arr[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int b(int number){
        int sum = number;
        while(number!=0) {
            int one = number % 10;
            sum += one;
            number /= 10;
        }
        return sum;
    }

}
