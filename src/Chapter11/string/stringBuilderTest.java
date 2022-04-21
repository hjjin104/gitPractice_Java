package Chapter11.string;

public class stringBuilderTest {
    public static void main(String[] args){
        String str1 = new String("Java");
        String str2 = new String("Android");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        StringBuilder builder = new StringBuilder(str1);
        builder.append(" and");
        builder.append(" Android");
        System.out.println(System.identityHashCode(builder));
        System.out.println(builder);
        String str11 = builder.toString();
        System.out.println(str11);
        System.out.println();

        System.out.println(System.identityHashCode(str11));
        System.out.println(str11.hashCode());
        System.out.println(System.identityHashCode(builder));
        System.out.println(builder.hashCode());

    }
}
