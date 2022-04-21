package Chapter11.object;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x= "+x+", "+"y= "+y;
    }
}

class Circle implements Cloneable{
    Point point;
    private int radius;

    public Circle(int x, int y, int radius){
        point = new Point(x,y);
        this.radius = radius;

    }

    public String toString(){
        return "원점은 "+ point +"이고, 반지름은 "+radius+"입니다.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class objectCloneTest {
    public static void main (String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10,4,4);
        Circle cloneCircle = (Circle)circle.clone();

        System.out.println(circle.toString());
        System.out.println(cloneCircle.toString());
        System.out.println();
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(cloneCircle));
    }
}
