package Chapter13.InnerClass;

class Outer{
    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(){
        int localNum = 100;
        class myRunnalbe implements Runnable{

            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }
        return new myRunnalbe();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.getRunnable().run();

    }
}
