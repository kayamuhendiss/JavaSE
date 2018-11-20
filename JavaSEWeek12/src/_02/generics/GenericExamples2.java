package _02.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples2 {
    public static void main(String[] args) {

        List<Animal> animalList =new ArrayList<Animal>();
        addElement(animalList);


        List<Dog> dogsList=new ArrayList<Dog>();
        //addElement(dogList); // compiler error , legal degildir.


        Dog[] dogArray=new Dog[3];
        //addElementArray(dogArray);  // Cat IS-A Dog degil bu nedenle runtime da exceptiona neden olur.
        List<Object> objectList=new ArrayList<>();
        //addElementObject(dogsList);  List<Object>
        addElementObject(objectList);

    }
    public  static void addElement(List<Animal> animals){
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Animal());



    }
    public  static void addElementArray(Animal[] animals){
        animals[0]=new Cat();


    }
    //Buraya sadece List<Object> gider.
    public  static void addElementObject(List<Object> objects){

    }
    // ? extends Object-> ? ayni anlama gelir.
    public  static void addElementObject2(List<? extends Object> objects){

    }
}

class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }
