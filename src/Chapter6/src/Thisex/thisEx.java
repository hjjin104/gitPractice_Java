package Chapter6.src.Thisex;

class birthDay{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

    public void printThis(){
        //this는 자기자신의 인스턴스의 주소값을 print해주기 때문에 사용 가능하다
        System.out.println(this);
    }
}

public class thisEx {
    public static void main(String[] args){
        birthDay b1 = new birthDay();
        birthDay b2 = new birthDay();
        System.out.println(b1);
        b1.printThis();

        System.out.println();

        System.out.println(b2);
        b2.printThis();

    }
}
