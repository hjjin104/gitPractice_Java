package Chapter13.lambda;

interface PrintString{
    void showString(String str);
}

public class lambdaTest {
    public static void main(String[] args) {
        PrintString lambdaPrint = str -> System.out.println(str);

        lambdaPrint.showString("Hello Java");

        showString(lambdaPrint);

        PrintString restr = returnPrint();
        restr.showString("Hello ");
    }

    public static void showString(PrintString lambda){
        lambda.showString("Hello Java2");
    }

    public static PrintString returnPrint(){
        return s -> System.out.println(s+"world");
    }
}
