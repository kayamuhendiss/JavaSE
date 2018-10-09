package _05.nonaccess.modifiers;

public class Notes {

}
//final
//abstract

//Bir sinif final class olarak tanimlanirsa kalitim yapilmaz(extends edilemez)
// public final class String
//public final class Integer

final class Animal{

}
//Animal sinifi final oldugu icin kalitim yapilamaz
//class Dog extends Animal{
//
// }

//abstract
//kalitim yapilmasina ovverride edilmesine tesvik eder
//bir sinifi abstract sinif olarak (icerisinde abstract metotlar olmasini bekleriz) ve amaci kalitmaktir

abstract class Car{
    abstract void getEngine();
}

class Ford extends Car{

    @Override
    void getEngine() {

    }
}