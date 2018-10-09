package _05.encapsulation;

public class Example01 {
    public static void main(String[] args) {
        BadEncapsulation badEncapsulation=new BadEncapsulation();
        badEncapsulation.number=20;

        GoodEncapsulation good=new GoodEncapsulation();
        good.setNumber(10);
    }
}
