package Chapter6.src.Thisex;

class Person{
    String name;
    int age;

    public Person(){
        name="No name";
        age = 0;
    }

    public Person(String name, int age){
        this.name =name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class CallAnotherConst {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setAge(28);
        p1.setName("Jin");

        System.out.println(p1.getAge());
        System.out.println(p1.getName());
    }
}
