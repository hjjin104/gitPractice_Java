package Chapter13.lambda;

public class MyNumberTest {
    public static void main(String[] args) {
        //lambda식 구현부
         MyNumber maxNum = (x,y) -> (x>=y) ? x:y; //return과 중괄호 생략, lambda식은 최대한 생략할 수 있는 부분들 다 생략하고 구현

        //lambda식 실현부
        int maxN = maxNum.getMaxNumber(10,20);
        System.out.println(maxN);
        
        //anomynous Class > lambda식으로 매서드를 구현하고 실현하면 내부적으로 익명 클래스가 생성됨
        MyNumber aaa = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                MyNumber max = (x,y) -> (x>=y) ? x:y;
               int maxNumber = max.getMaxNumber(102,30);
               return maxNumber ;
            }
        };
    }
}
