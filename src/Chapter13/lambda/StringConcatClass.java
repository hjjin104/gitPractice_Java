package Chapter13.lambda;

public class StringConcatClass implements StringConcat{

    @Override
    public void makeString(String str1, String str2)  {
        System.out.println(str1 +", "+str2);
    }
}
