package _01.generics;


public class GenericExamples {

	public static void main(String[] args) {
	
		Animal animalDog = new Dog();
		//
		//List<Animal> animalDogList = new ArrayList<Dog>(); // compiler error
		//animalDogList.add(new Dog());
		//animalDogList.add(new Cat());
		// Dog IS-A Animal
		// ArrayList IS-A List olsa da bu sekilde kullanmak legal degildir. compiler error.
		
		Animal[] animalDogArray = new Dog[5];
		animalDogArray [0] = new Dog();
		animalDogArray [1] = new Cat(); // java.lang.ArrayStoreException
		// Cat IS-A Dog olmadigi icin runtime da exception aliriz.
	}
}


class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {

}
