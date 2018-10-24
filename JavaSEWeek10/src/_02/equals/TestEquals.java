package _02.equals;

public class TestEquals {
    public static void main(String[] args) {


        Employee person=new Employee("zuleyha","kaya",24,"istanbul");
        Employee person1=new Employee("zuleyha","kaya",24,"istanbul");

        System.out.println(person==person1);
        System.out.println(person.equals(person1));

        // java.lang.Object sinifinda yer alan equals metodu aslinda == ile ayni sekilde calisir.
        /* public boolean equals(Object obj) {
            return (this == obj);
        }*/
    }
}
