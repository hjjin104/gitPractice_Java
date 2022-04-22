package Chapter12.memberEX.collection.HashMap;
import Chapter12.memberEX.Member;

import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1001, "Jin");
        Member member2 = new Member(1002, "Levant");
        Member member3 = new Member(1003, "Kim");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);

        memberHashMap.showAll();
        System.out.println();

        memberHashMap.removeMember(1002);
        memberHashMap.showAll();

    }
}
