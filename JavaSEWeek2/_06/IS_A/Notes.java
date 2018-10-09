package _06.IS_A;

public class Notes {
}
class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
class Kangal extends Dog{

}
//Dog IS-A Animal DOGRUDUR
//Cat IS-A Animal DOGRUDUR
//Dog IS-A Cat    YANLISTIR


//Animal IS-A Dog YANLISTIR
//Animal IS-A Cat YANLISTIR

//Kangal IS-A Dog     DOGRUDUR
//Kangal IS-A Animal  DOGRUDUR

interface Speedy{

}
class Car{

}

class Hummer extends Car implements Speedy{

}

//Hummer IS-A Car     DOGRUDUR
//Hummer IS-A Speedy  DOGRUDUR
//Car IS-A Speedy     YANLISTIR