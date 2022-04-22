package Chapter12.memberEX.collection.arrayList;

import Chapter12.memberEX.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member(101, "Lee");
        Member memberJin = new Member(102, "Jin");
        Member memberNicolas = new Member(103, "Nicolas");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberJin);
        memberArrayList.addMember(memberNicolas);

        memberArrayList.showAll();
        memberArrayList.removeMember(101);
        memberArrayList.removeMember(104);
        memberArrayList.showAll();
    }
}
