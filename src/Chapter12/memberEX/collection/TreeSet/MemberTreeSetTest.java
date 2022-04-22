package Chapter12.memberEX.collection.TreeSet;

import Chapter12.memberEX.Member;

import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args){
        MemberTreeSet memberTreeSet =  new MemberTreeSet();

        Member m1 = new Member(101, "Jin");
        Member m2 = new Member(102, "Levant");
        Member m3 = new Member(103, "Choi");
        Member m4 = new Member(104, "Jeon");
        Member m5 = new Member(103, "Michelle");


        memberTreeSet.addMember(m1);
        memberTreeSet.addMember(m2);
        memberTreeSet.addMember(m3);
        memberTreeSet.addMember(m4);
        memberTreeSet.addMember(m5);

        memberTreeSet.showAll();

    }
}
