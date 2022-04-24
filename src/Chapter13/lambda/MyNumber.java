package Chapter13.lambda;

@FunctionalInterface
public interface MyNumber {
//lambda = 익명함수와 매개변수로만 구현되기 때문에 단 하나의 매서드만을 가져야 함
    int getMaxNumber(int num1, int num2);
}
