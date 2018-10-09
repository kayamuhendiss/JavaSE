package _08.inheritance;

public class Notes {
}
// kalitimin(inheritance) 2 temel amaci vardir ;

// 1) kod tekrarini onlemek (duplication)
// 2) polymorphism saglamak(dynamic)
abstract class Animal{
    public void walk(){

    }

    public  void eat(){

    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("sound...");

    }

    @Override
    public void eat() {

    }
}
class Cat extends Animal{
    public void mew(){
        System.out.println("mew...");

    }

    @Override
    public void eat() {

    }
}
class Bird extends Animal{
    @Override
    public void walk(){

    }

    @Override
    public void eat() {

    }
}