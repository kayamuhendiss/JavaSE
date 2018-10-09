package _08.classMembers.nonaccess.modifiers;
class Animal{
    public void eat(){
        System.out.println("Animal #eat");
    }
    public final void run(){
        System.out.println("Animal #run");

    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        super.eat();
    }
    //final method override edilemez
//    public final void run(){
//
//    }
}
public class Example01 {
    public static void main(String[] args) {

    }
}
