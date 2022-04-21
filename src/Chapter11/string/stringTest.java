package Chapter11.string;

public class stringTest {
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1==str2);

        String str3 = "abc";
        String str4= "abc";
        System.out.println(str3==str4);

        System.out.println();

        String Str1 = new String("java");
        String Str2 = new String("android");

        System.out.println(System.identityHashCode(Str1));
        System.out.println(System.identityHashCode(Str2));

        Str1 = Str1.concat(str2);
        System.out.println(System.identityHashCode(Str1));
    }
}
