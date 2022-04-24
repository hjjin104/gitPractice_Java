package Chapter13.stream;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length < s2.getBytes().length)
            return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~","hello","How are you today?", "반갑습니다."};

        String wordlength = Arrays.stream(greetings).reduce("",(s1, s2) ->{
            if (s1.getBytes().length >s2.getBytes().length)
                return s1;
            else return s2;
        });
        System.out.println(wordlength);

        Arrays.stream(greetings).reduce("", new CompareString());

        String str =Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
