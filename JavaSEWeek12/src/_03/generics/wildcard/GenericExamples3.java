package _03.generics.wildcard;

import java.util.List;
import java.util.ArrayList;

public class GenericExamples3 {
    public static void main(String[] args) {

        List<Animal> animalList=new ArrayList<Animal>();
        addElementGenericRule(animalList);

        List<Dog> dogList=new ArrayList<Dog>();
        addElementWillCard(dogList);

        List<Cat> catList=new ArrayList<>();
        List<Kangal> kangalList=new ArrayList<>();
        List<Object> objectList=new ArrayList<>();

        addElementWillCard(catList);
        addElementWillCard(animalList);

        addElementWillCardSuper(dogList);
        addElementWillCardSuper(animalList);
        // addElementWillCardSuper(catList); compiler error
       // addElementWillCardSuper(kangalList); compiler error
        addElementWillCardSuper(objectList);


        //dogList.add(new Animal()); // Animal IS-A Dog degildir! Dog IS-A Animal
        dogList.add(new Dog());
        dogList.add(new Kangal()); // Kangal IS-A Dog onermesi dogrudur.



    }

    public static void addElementGenericRule(List<Animal> animals){


    }

    public static void addElementWillCard(List<? extends SuperAnimal> animals){
        // ? wildcardi ile extends kullanildiginda burada elaman EKLEMEYE IZIN VERMEZ!
        //animals.add(new Cat());
        //animals.add(new Dog());
        animals.add(null);


    }
    // ? super Dog -> Dog ya da superi olmasi gerekli!
    public static void addElementWillCardSuper(List<? super Dog> dogs){

        dogs.add(new Kangal());
        dogs.add(new Dog());

    }

}

interface SuperAnimal{}
class Animal implements SuperAnimal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
class Kangal extends Dog{

}