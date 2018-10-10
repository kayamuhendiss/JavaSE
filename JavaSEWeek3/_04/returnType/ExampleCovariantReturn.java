package _04.returnType;

class Computer {
	
}

class Laptop extends Computer {
	
}


class SuperClass {
	
	public Computer getComputer(){
		return null;
	}
}



class SubClass extends SuperClass {
	
	@Override
	public Laptop getComputer(){
		return null;
	}
}
// Laptop IS-A Computer oldugu icin override metod icin donus tipini degistirdik!
// legaldir , covariant return adi verilir.


public class ExampleCovariantReturn {

}
