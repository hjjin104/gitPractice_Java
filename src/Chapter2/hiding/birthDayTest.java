package Chapter2.hiding;

class birthDay{
    //public의 경우, 외부의 모든 class에서 다 가져다 사용할 수 있음
    //private의 경우, 같은 파일이어도 볼 수 없고 같은 class 안에서만 사용 가능, 데이터 숨기기 기능
    //default의 경우, 같은 패키지(폴더) 내에서는 사용 가능
    private int day;
    private int month;
    private int year;

    //method를 이용해서 변수에 접근 가능
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month ==2){
            if(day < 1 || day > 28){
                System.out.println("Your day input is wrong. There is no "+day+" in Feburary.");
            }
        }else if (month %2 ==1){
            if(day < 1 || day > 31){
                System.out.println("Your day input is wrong. There is no "+day+" in "+month+".");
            }
            else{
                System.out.println("My birthday is "+day+"."+month+"."+year);
            }
        }
        else{
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class birthDayTest {
    public static void main(String[] args){
        birthDay myBirthDay = new birthDay();

        // 달을 먼저 설정해줘야 println구문이 잘 실행된다
        myBirthDay.setMonth(1);
        myBirthDay.setYear(1995);
        myBirthDay.setDay(32);

    }
}
