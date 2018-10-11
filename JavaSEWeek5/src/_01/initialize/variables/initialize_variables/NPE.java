package _01.initialize.variables.initialize_variables;

public class NPE {

	public static void main(String[] args) {

		Person person = new Person();
		int length = person.getName().length();
		// person.getName() -> null dir
		// String name; instance variable i icin java otomatik olarak null
		// degerini assign eder.
		// null degerine sahip bir reference type degisken uzerinden bir
		// instance methoda (length()) metoduna gitmek istersek/cagirmak
		// istersek burada NullPointerException aliriz.
		System.out.println(length);
	}
}
