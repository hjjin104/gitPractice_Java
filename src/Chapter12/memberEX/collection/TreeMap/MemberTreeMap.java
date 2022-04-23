package Chapter12.memberEX.collection.TreeMap;

import Chapter12.memberEX.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (treeMap.containsKey(memberID)) {
            treeMap.remove(memberID);
            return true;
        }
        System.out.println("There's no memberID("+memberID+").");
        return false;
    }
    public void showAll(){
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
    }

}
