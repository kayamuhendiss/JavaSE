package _10.override;

class Animal {
    public void eat() {
        System.out.println("Animal#eat");
    }

    public void run() {
        System.out.println("running...");
        //
        //
        //
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog#eat");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("extra configuration buisiness logic...");
        //
        //
    }

}

public class Example02 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        //Dog dogAnimal = new Animal(); // Animal IS-A Dog DEGILDIR!

        Animal animalIS_A_Ref = new Dog();
        animalIS_A_Ref.eat();
        // override soz konusu oldugunda , hangi metodun calisacagina run-time da karar verilir (late binding)
        // ve ilgili metot calisir. burada objenin tipi Dog oldugu icin ,Dog sinifinda yer alan eat metodu calisir!
        // dynamic dispatch adi verilir.

        dog.run();
    }
}
