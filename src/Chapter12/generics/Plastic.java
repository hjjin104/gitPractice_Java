package Chapter12.generics;

public class Plastic extends Material{
    public String toString(){
        return "현재 프린터는 Plastic 프린터입니다. 재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic 프린터가 작동됩니다.");
    }
}
