package Chapter13.InnerClass;

class Outclass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public Outclass() {
        inClass = new InClass();
    }

    private class InClass {
        int inNum = 100;
// static 변수 및 매서드는 instance 생성과 상관 없이 사용할 수 있어야하기 때문에 생성자가 반드시 필요한 innerClass의 경우, 사용할 수 없다

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }

        public void usingInTest() {
            inClass.inTest();
        }

        static class InStaticClass {
            int iNum = 100;
            static int sInNum = 200;

            void inTest() {
                // num += 10; //외부클래스의 인스턴스 변수(static 없는)는 사용 불가
                sNum += 10;
                System.out.println(sNum);
                System.out.println(iNum);
                System.out.println(sInNum);
            }

            static void sTest() {
                System.out.println(sNum);
                System.out.println(sInNum);
            }

        }


    }

    public class InnerTest {
        public static void main(String[] args) {
            Outclass outClass = new Outclass();
//            outClass.usingInTest();

            //outClass.inClass.inTest(); InClass private으로 선언, 외부에서 인수 선언 불가

            //   Outclass.InClass inClass = outClass.new InClass();

//            Outclass.InStaticClass inStaticClass = new Outclass.InStaticClass();
//            inStaticClass.inTest();
        }
    }
}