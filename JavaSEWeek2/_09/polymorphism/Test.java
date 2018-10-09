package _09.polymorphism;


class Animal{

}

class Dog extends Animal{

}


public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();

        Animal animaldog=new Dog();  //Dog IS-A Animal
        //reference type
        //local variable
        //Degiskenin tipi Animal
        //Objenin tipi Dog



        Object object = animaldog; // java.lang.Object sinifi , sinif hiyerarsisinin tepesinde yer alir!!!!

        // butun siniflar icin IS-A java.lang.Object DOGRUDUR!

        //Dog dogAnimal = new Animal(); // Animal IS-A Dog DEGILDIR!
        //Degisken tipi Dog
        //objenin tipi Animal
        // LEGAL DEGILDIR!
    }

}
