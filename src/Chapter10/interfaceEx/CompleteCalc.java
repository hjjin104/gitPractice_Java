package Chapter10.interfaceEx;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if(num2 != 0){
            return num1/num2;
        }
        return ERROR;
    }

    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }

//    @Override
//    public void description() {
//        System.out.println("완벽한 계산기를 실행합니다.");
//    }
}
