package Chapter12.memberEX.collection.arrayList;

import Chapter12.memberEX.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberID) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            int tempID = member.getMemberID();
//            if (tempID == memberID) {
//                arrayList.remove(i);
//                System.out.println("회원번호 " + memberID + "번이 삭제되었습니다.");
//                return true;
//            }
//        }
        Iterator<Member> iterator = arrayList.iterator();
        while(iterator.hasNext()){ //hasNext 다음번 가져올 element가 있느냐
            Member member = iterator.next();
            int tempID = member.getMemberID();
            if(tempID == memberID){
                arrayList.remove(member);
                System.out.println("회원번호 " + memberID + "번이 삭제되었습니다.");
                return true;
            }
        }
        System.out.println("회원번호 " + memberID + "가 존재하지 않습니다.");
        System.out.println();
        return false;
    }

    public void showAll() {
        for (Member m : arrayList) {
            System.out.println(m);
        }
        System.out.println();
    }
}
