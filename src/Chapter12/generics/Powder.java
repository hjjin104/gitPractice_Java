package Chapter12.generics;

public class Powder extends Material {
    public String toString(){
        return "현재 프린터는 Powder 프린터입니다. 재료는 Powder 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder 프린터가 작동됩니다.");
    }
}
