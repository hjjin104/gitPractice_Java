package Chapter14.exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            return;
        }finally{ // finally 구문은 try 구문 실행 시 무조건 1번은 실행됨, error 발생 여부 영향 X
            System.out.println("finally");
        }
        System.out.println("end");
    }
}

