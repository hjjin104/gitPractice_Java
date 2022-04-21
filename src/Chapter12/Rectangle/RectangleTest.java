package Chapter12.Rectangle;

public class RectangleTest {
    public static void main(String[] args){
        Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);
        Point<Integer, Double> p2 = new Point<Integer, Double>(123,15.0);

        double rect = CalcRectangle.<Integer,Double>makeRectangle(p1,p2);
        System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+"입니다.");
    }
}
