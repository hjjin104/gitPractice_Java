package Chapter12.memberEX.collection.HashMap;

import Chapter12.memberEX.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (hashMap.containsKey(memberID)) {
            hashMap.remove(memberID);
            return true;
        }
        System.out.println("회원번호(" + memberID + ")가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while (ir.hasNext()) {//hashMap에 있는 키를 하나씩 돌면서
            int key = ir.next(); // ir의 key값을 하나씩 가져옴

            Member member = hashMap.get(key); //key 값을 가지고  member를 하나씩 가져옴
            System.out.println(member);


        }
    }
}
