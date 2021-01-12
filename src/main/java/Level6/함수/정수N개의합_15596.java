package Level6.함수;

public class 정수N개의합_15596 {

    public long sum(int[] a){
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
