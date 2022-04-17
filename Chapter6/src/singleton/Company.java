package singleton;

public class Company {
    private static Company instance = new Company();
    private Company(){};

    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }
        return instance;
    }



















//    private static Company company1 = new Company();
//
//    private Company(){}
//
//    public static Company getInstance(){//객체를 생성하지 않고 매서드를 호출할 수 있는 방법 = static 설정
//        if(company1 ==null){
//            company1 = new Company();
//        }
//        return company1;
//    }
}
