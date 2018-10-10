package _02.overloaded;

//Ambiguous -> belirsiz/cok anlami
class AmbiguousOverload {
	public static void aMethod(long val1, int val2) {
		System.out.println("long, int");
	}

	public static void aMethod(int val1, long val2) {
		System.out.println("int, long");
	}
	
//	public static void aMethod(int val1, int val2) {
//		System.out.println("int, long");
//	}

	public static void main(String[] args) {
		//The method aMethod(long, int) is ambiguous for the type AmbiguousOverload
		//aMethod(9, 10);
	}
}