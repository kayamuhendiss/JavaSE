package _02.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample04 {
    public static void main(String[] args) {
        Person person1=new Person("1","Z","K",24);
        Person person2=new Person("1","Z","K",24);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        Set<Person> setPerson=new HashSet<>();
        setPerson.add(person1);
        setPerson.add(person2);

        // Set yapisi DUPLICATE elemana izin vermez!
        // equals true ise duplicate anlamaina gelir
        // equals ve hash code methodlarini override edersek bu durumda  equals true olur!
        //


        System.out.println(setPerson.size());
    }
}
