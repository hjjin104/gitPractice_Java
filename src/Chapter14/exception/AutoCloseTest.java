package Chapter14.exception;

public class AutoCloseTest {
    public static void main(String[] args){
        //try(AutoCloseObj obj = new AutoCloseobj()){}

        AutoCloseObj obj = new AutoCloseObj();
        try(obj){//AutoCloseObj class에서 생성한 close() 매서드 호출
            throw new Exception(); // 강제로 exception 발생
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
