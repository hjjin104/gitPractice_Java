package Chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
         List<String> sList = new ArrayList<String>();
        sList.add("Jin");
        sList.add("Nicolas");
        sList.add("Choi");
        sList.add("Jeong");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));
        System.out.println();

//        for(String s: sList){
//            System.out.println(s );
//        }

        sList.stream().sorted().forEach(s -> System.out.println(s)); // sorted = 중간 연산자, forEach = 최종 연산자
        //따라서 forEach까지 실행한 후 stream이 초기화, 다른 연산이 필요하다면 stream 재정의 후 사용 가능
    }
}
