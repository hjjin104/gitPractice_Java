package Chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int sum = Arrays.stream(arr).sum(); // stream 생성완료
//        System.out.println(sum);

        IntStream stream = Arrays.stream(arr);
        int sum= stream.sum();
        System.out.println(sum);


        // int count = (int) stream.count(); //int casting, // 이미 해당 stream이 사용 완료, 한 번 사용된 stream은 최종 연산자가 불리면 소멸됨
        int count = (int) Arrays.stream(arr).count();
        System.out.println(count);
    }
}
