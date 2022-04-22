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

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(this.memberID==member.memberID){
                System.out.println("이미 등록이 완료된 ID입니다. 다른 ID를 작성해주세요.");
                return true;
            }else{
                return false;
            }
        }return false;
    }
}
