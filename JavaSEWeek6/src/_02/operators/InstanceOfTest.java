package _02.operators;
interface Speedy{

}

class Car{

}
class Ford extends Car implements Speedy{

}
public class InstanceOfTest {
    public static void main(String[] args) {

        Ford ford=new Ford();
        System.out.println(ford instanceof Car);
        System.out.println(ford instanceof Ford);
        System.out.println(ford instanceof Speedy);  //ford IS-A CAR
        System.out.println();                       //ford IS-A Speedy

    }
}
