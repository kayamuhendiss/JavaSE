package _03.variable.casting;
class Animal{
    public void eat(){
        System.out.println("Animal eat");
    }

}
class Dog extends Animal{
    public void eat(){
        System.out.println("Animal eat");
    }
    public void bark(){
        System.out.println("Dog Bark");
    }

}
class Cat extends Animal{
    public void meow(){
        System.out.println("Meow Bark");
    }

}
public class Test01 {
    public static void main(String[] args) {

//		Dog dog = (Dog) animal;
        //java.lang.ClassCastException
        //downcasting
        //kalitim hiyerarsisinde ust siniftan -> alt sinifa (super-sub) casting -> downcasting

        // Dog tipindeki bir degisken Animal tipindeki bir objeyi gosteremez.
        // Animal IS-A Dog DEGILDIR!!
        Animal animal=new Animal();
        //Dog dog= (Dog) animal;
        if(animal instanceof Dog) {
            Dog dog2 = (Dog)animal;
            System.out.println("it is dog!");
        }else  if (animal instanceof Cat) {
            //
            Cat cat1 = (Cat) animal;

            //String compileError = (String)animal;

        }

        Dog dog2=new Dog();
        Animal animaldog=dog2;

        Animal animalarray[]={new Animal(),new Dog(),new Cat()};
        for(Animal a:animalarray){
            if (a instanceof Dog){
                ((Dog) a).bark();
            }
            else if (a instanceof Cat){
                ((Cat) a).meow();
            }

        }
}
}
