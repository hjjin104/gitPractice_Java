package Chapter12.memberEX.collection.arrayList;

import java.util.ArrayList;

class Mystack {
    private ArrayList<String> arrayStack = new ArrayList<String>();
    public void push(String data){
        arrayStack.add(data);
    }

    public String pop(){
        int len = arrayStack.size();
        if(len<=0){
            System.out.println("스택이 비었습니다");
            return null;
        }
        return arrayStack.remove(len-1);
    }

    public String peek(int count){
        int len = arrayStack.size()-1;
        return arrayStack.get(len-count);
    }
}

public class StackTest {
    public static void main(String[] args){
        Mystack stack = new Mystack();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.peek(0));
        System.out.println(stack.peek(1));


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
