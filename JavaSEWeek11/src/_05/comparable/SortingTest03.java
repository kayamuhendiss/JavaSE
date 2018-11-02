package _05.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest03 {
    public static void main(String[] args) {

        Person person1=new Person("Zuleyha","Kaya",24,1);
        Person person2=new Person("Iskender","Kaya",25,3);
        Person person3=new Person("Derya","Celen",35,5);
        Person person4=new Person("Burak","Celen",10,8);
        Person person5=new Person("Ayse","Karadeniz",32,7);
        Person person6=new Person("Emine","Kayis",32,4);

        List<Person> personList=new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);

        Collections.sort(personList);
        for (Person p:personList){


        System.out.println(p);
    }
    }

}

class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;
    private int id;

    public Person(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }


    @Override
    public int compareTo(Person p) {
        return Integer.valueOf(id).compareTo(p.id);
        //return Integer.valueOf(p.id).compareTo(id);
        //return  name.compareTo(p.name);
        //return  p.name.compareTo(name);
    }
}
