package _01.toString;

import java.util.Arrays;

public class TestToString {
    public static void main(String[] args) {
        Person person=new Person("zuleyha","kaya",24,"istanbul");
        Person person1=new Person("z","k",24,"i");
        System.out.println(person );
        System.out.println(person1 );
        //output  _01.toString.Person@2133c8f8
        int []arrays={1,2,3,4};
        System.out.println(arrays);

        Arrays.stream(arrays).forEach(System.out::println);

    }
}
