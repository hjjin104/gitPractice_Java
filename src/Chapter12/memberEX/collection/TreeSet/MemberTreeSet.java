package Chapter12.memberEX.collection.TreeSet;

import Chapter12.memberEX.Member;
import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet{
    private TreeSet<Member> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<Member>(new Member());
    }
    public void addMember(Member member){
        treeSet.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            if(memberID == member.getMemberID()){
                treeSet.remove(memberID);
                System.out.println("Member ID("+memberID+") is deleted.");
                return true;
            }
        }
        System.out.println("Member ID("+memberID+") is not exist.");
        return false;
    }

    public void showAll(){
//        treeSet = new TreeSet<Member>();
//        for(Member m : treeSet){
//            System.out.println(m);
//        }

        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member);
        }
    }


}
