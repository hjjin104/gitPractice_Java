package Chapter12.memberEX.collection.hashset;

import Chapter12.memberEX.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int nextID = member.getMemberID();
            if (nextID == memberID) {
                hashSet.remove(member);
                System.out.println("Delete complete.");
                return true;
            }
        }
        System.out.println("There's no ID number(" + memberID+").");
        return false;
    }

    public void showAll() {
//        hashSet = new HashSet<Member>();
//        for(Member h: hashSet){
//            System.out.println(h);
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member);
        }
    }
}
