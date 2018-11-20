package _06.nested;

public class Notes {
    public static void main(String[] args) {
        Notes notes=new Notes();
        notes.createMyLocalClass();


    }

    private String password="12345";

    public void createMyLocalClass() {

        //private String name="compilerError"; // private olamaz.

        String name= "test";

        //name ="test2"; // dLocal variable name defined in an enclosing scope must be final or effectively final

            class LocalInner {
                private void method() {
                    System.out.println(name);
                    System.out.println(password);
                }
            }

        LocalInner localInner=new LocalInner();
        localInner.method();

    }
}
