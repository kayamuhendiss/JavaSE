package _02.passByValueVsPassByReference;

public class Test2 {

	public static void main(String[] args) {
		
		Person person = new Person("Levent", 28);
		
		System.out.println(person.getName() + " " + person.getAge());
		
		nullReference(person);
		
		System.out.println(person.getName() + " " + person.getAge());
	}

	public static void nullReference(Person personLocal){

		personLocal = null;
	}
}
