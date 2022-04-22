package Chapter12.memberEX.collection.hashset;

import Chapter12.memberEX.Member;

public class MemberHashSetTest {
    public static void main(String[] args){
        MemberHashSet memberHashSet = new MemberHashSet();
        Member member1 = new Member(1001, "Jin");
        Member member2 = new Member(1002, "Levant");
        Member member3 = new Member(1003, "Kim");


        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        Member member4 = new Member(1001, "Lee");
        memberHashSet.addMember(member4);

        memberHashSet.showAll();
        System.out.println();

        memberHashSet.removeMember(1001);
        memberHashSet.removeMember(1002);
        memberHashSet.removeMember(1003);
        memberHashSet.removeMember(1004);
        memberHashSet.showAll();
    }
}
