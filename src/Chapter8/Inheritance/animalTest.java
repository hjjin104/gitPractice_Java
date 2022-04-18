package Chapter8.Inheritance;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다");
    }
}
class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다");
    }
}
class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네발로 달립니다");
    }
}
class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다");
    }
}


public class animalTest {
    public static void main(String[] args) {
        animalTest test = new animalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

        //Animal animal = new Human(); //부모 클래스 타입으로 자식 클래스를 인스턴스화 할 수 있음
        //부모 클래스의 모든 함수 및 기능을 받지만 자식 클래스에서 재정의된 매서드가 있다면 해당 매서드로 치환되어 호출됨
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
