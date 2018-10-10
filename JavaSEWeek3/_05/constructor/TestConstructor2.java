package _05.constructor;

class Animal{
    Animal(){
        super();
        System.out.println("Animal Constructor");

    }

}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Constructor");
    }
}
class Kangal extends Dog{
    Kangal(){
        System.out.println("Kangal Constructor");
    }

        }

public class TestConstructor2 {
    public static void main(String[] args) {

        Dog animaldog=new Kangal();
        //objemizin tipi Kangal
        // constructor chaining -> en ust super class a ait contructor calisir sirayisla asagiya dogru inmeye baslar!

    }
}
