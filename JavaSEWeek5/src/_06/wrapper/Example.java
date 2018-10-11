package _06.wrapper;

public class Example {
    public static void main(String[] args) {

        int primitive=100;
        Integer wrapper=primitive;
        //otomatik olarak primitive-->wrapper a donusum islemini gerceklestirdi AUTOBOXING

        Integer inte=new Integer(100);//BOXING
        Integer integ=Integer.valueOf(100);  //Boxing


        Integer number=new Integer(100);
        int primitiveValue= number;  //  auto-unboxing(wrapper-->primitive)

        int primitiveValue2=number.intValue();// metod yardimiyla yapildiginda  wrapper-->primitive yaptigimizda unboxing
    }
}
