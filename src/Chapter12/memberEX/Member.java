package Chapter12.memberEX;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
    private String memberName;
    private int memberID;

    public Member() {
    }

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public String getMemberName() {
        return getMemberName();
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String toString() {
        return memberName + "회원님의 아이디는 " + memberID + "입니다.";
    }

    @Override
    public int hashCode() { //hashCode의 자료형은 int!
        return memberID;
    }

    @Override
    public int compare(Member member1, Member member2) { //member1 = 나, member2 =넘어오는 값
        return member1.memberID-member2.memberID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberID==member.memberID||this.memberName==member.memberName) {
                System.out.println("This ID("+member.memberID+") already exist. Change to another one and try again.");
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {//(Member member)의 member는 기존 트리 노드에서 비교되어 넘어올 값
        //나(원래 있던 트리 노드) = this

//        return (this.memberID-member.memberID); //int로 비교할 경우
        return (this.memberName.compareTo(member.memberName));
    }
}
