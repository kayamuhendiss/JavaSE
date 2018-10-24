package _03.hashCode;

public class TestHashCode {
    public static void main(String[] args) {
        Customer person=new Customer("zuleyha","kaya",24,"istanbul");
        //Customer person1=new Customer("zuleyha","kaya",24,"istanbul");

        System.out.println(person.hashCode());  //557041912

    }

    // x.equals(y) == true ise x.hashCode() == y.hashCode() true OLMAK zorundadir.
    // x.hashCode() == y.hashCode() ise  x.equals(y) == true OLMAK ZORUNDA DEGILDIR!
    //x.hashCode() !=y.hashCode() ise x.equals(y) == false olmalidir!
}
