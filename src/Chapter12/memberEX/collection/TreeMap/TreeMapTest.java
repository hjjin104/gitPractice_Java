package Chapter12.memberEX.collection.TreeMap;

import Chapter12.memberEX.Member;

import java.util.TreeSet;

public class TreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap treeMap = new MemberTreeMap();

        Member m1 = new Member(100, "Jin");
        Member m2 = new Member(101, "Nicolas");
        Member m3 = new Member(102, "Choi");
        Member m4 = new Member(101, "Kim");

        treeMap.addMember(m1);
        treeMap.addMember(m2);
        treeMap.addMember(m3);
        treeMap.addMember(m4);

        treeMap.showAll();

    }
}
