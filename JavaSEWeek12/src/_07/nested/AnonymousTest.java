package _07.nested;

public class AnonymousTest {
    public static void main(String[] args) {

        Person person=new Person();
        person.printMessage();

        Person anonimClass = new Person() {
            @Override
            public void printMessage() {
                System.out.println("Hello anonimClass!");
            }
        };

        Person anonimClass2 = new Person() {
            @Override
            public void printMessage() {
                System.out.println("Hello anonimClass!");
            }
        };
        System.out.println(person.getClass());
        System.out.println(anonimClass.getClass());
        System.out.println(anonimClass2.getClass());

        anonimClass.printMessage();

        MyInterface myInterface = new MyInterface() {

        };



    }
}

class Person{
    public void printMessage(){
        System.out.println("Hello Word");
    }
}

interface MyInterface {

}
