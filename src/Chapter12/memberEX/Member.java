package Chapter12.memberEX;

public class Member {
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
}
