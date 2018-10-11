package _02.overloaded;
class Calculator{
    //Overloaded methods CAN change the access modifier.
    private void calculate(int a,int b){
        System.out.println("int");

    }
    public int calculate(double a,double b){
        System.out.println("double");
        return 0;

    }
    public void testFloat(float f) {

    }

}

public class OverloadedTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.calculate(10,10);
        calculator.calculate(12.4,12.5);
        calculator.calculate(10,12.6);

        //calc.testFloat(20.0);// derleme hatasi verir
        calculator.testFloat(20.0f);
    }
}
