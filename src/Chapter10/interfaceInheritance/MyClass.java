package Chapter10.interfaceInheritance;

public class MyClass implements MyInterface{
    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }
    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.myMethod();
        myClass.x();
        myClass.y();

        X xClass = new MyClass(); //Instance가 생성되었다고 해도 어떤 type의 대입되었는지에 따라 사용할 수 있는 method가 한정적일 수 있다.
        xClass.x();
    }
}
