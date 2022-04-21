package Chapter12.generics;

public class ThreeDPrinterTest {
    public static void main(String[] args){
        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>(); //Class 옆 <> 기호로 참조형 타입(class)을 입력시키면 generic 타입으로 사용 가능
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(powder.toString());

        ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic = printerPlastic.getMaterial();
        plastic.doPrinting();
        System.out.println(plastic.toString());

//        ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
//        printerWater.setMaterial(new Water());
//        Water water = printerWater.getMaterial();
////        System.out.println(water);
//        System.out.println(water.toString());
    }
}
