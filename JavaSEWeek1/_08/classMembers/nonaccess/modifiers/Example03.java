package _08.classMembers.nonaccess.modifiers;

public class Example03 {

	public void testMethod() {
		//yasam alani tanimlandigi metotla sinirlidir.
		int age = 20; // local variable , primitive
		
		//private int number= 20; //local degiskenler access level alamaz!
		// non access modifier olarak final diyebiliri
		
		final int number = 30;
		//volatile int number3=20;// 
		//local degiskenler icin non-access modifier olarak sadece final kullanilabilir!!
		
		//static int number5 = 10; // compiler error
	}
	
	public void testMethod2() {
		//local degiskenlere bir baska metottan erisim SAGLANAMAZ!
		//System.out.println(age); //compiler error!
	}
}
