package Chapter11.classex;

public class ClassTest {
    public static void main(String[] agrs) throws ClassNotFoundException {
        Person person = new Person();

        Class pClass1 = person.getClass(); //Person에는 getClass라는 method가 없음 > getClass라는 method는 Object 것
        System.out.println(pClass1);
        System.out.println(pClass1.getName());
        System.out.println();

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());
        System.out.println();

        Class pClass3 = Class.forName("Chapter11.classex.Person");
        System.out.println(pClass3.getName());

        Class pClass4 = Class.forName("java.lang.String");
        System.out.println(pClass4.getName());
    }
}
