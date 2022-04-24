package Chapter13.lambda;

public class StringConCatTest {
    public static void main(String[] args) {

        //객체지향(OPP)방식으로 구현
        StringConcatClass stringConcat = new StringConcatClass();
        stringConcat.makeString("Hello", "Java");


        //Lambda식 구현
        StringConcat concat = (str1, str2) -> System.out.println(str1+", "+str2);
        concat.makeString("Java","is Difficult");

        //Lambda식 구현 재선언하면 inner Class 자동으로 생김, 위와 동일함
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String str1, String str2)  {
                System.out.println(str1+", "+str2);
            }
        };
        concat2.makeString("Hello", "Difficult Java");
    }
}
