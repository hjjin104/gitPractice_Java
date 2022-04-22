package Chapter12.memberEX.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        boolean b = set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
        System.out.println(b);
        System.out.println();

        boolean b1 = set.add("aaa");
        System.out.println(set);
        System.out.println(b1); // 2번째 "aaa"는 add되지 않음
    }
}
