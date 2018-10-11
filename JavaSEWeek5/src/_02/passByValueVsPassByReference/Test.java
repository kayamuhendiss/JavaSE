package _02.passByValueVsPassByReference;

public class  Test {

	public static void main(String[] args) {
		Person person = new Person("old name",20);
		
		System.out.println(person.getName() + " " +  person.getAge()) ;
		
		//1)metoda Person tipindeki reference degiskeni vermekteyiz.
		//reference degisken -> heapteki objenin adress bilgisini tutan bit yapisidir/bit pattern
		//burada objenin kopyalanmasi gibi bir sey soz konusu degil.
		//objenin kendisi heapte yasamaktadir.
		changeFields(person);

		System.out.println(person.getName() + " " +  person.getAge()) ;
		
	}

	public static void changeFields(Person person){
		person.setName("new name");
		person.setAge(30);

	}
	

	
	
}
