package Chapter7;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] num = new double[5];
        int size=0;
        //모든 배열이 다 차지 않았을 때 반복문에서 i를 length만큼 돌리면 유효한 값까지의 계산값이 나오는게 아니라 0으로 나옴
        //따라서 유효한 값을만 따져서 결과를 알고 싶을 때는 변수를 하나 더 만들어서 개수를 증가시켜줌
        num[0] =10.0; size++;
        num[1] =20.0; size++;
        num[2] =30.0; size++;
//        num[3] =40.0;
//        num[4] =50.0;

        double total=1.0;

        for(int i=0; i<size;i++){
            System.out.println(num[i]);
            total *= num[i];
        }
        System.out.println("total = "+total);
    }
}
