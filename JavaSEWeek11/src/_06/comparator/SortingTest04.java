package _06.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest04 {
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

        PersonNameComparator comparator=new PersonNameComparator();
        PersonAgeComparator comparator1=new PersonAgeComparator();

        Collections.sort(personList,comparator);
        for (Person pl:personList){
            System.out.println(pl);
        }
        System.out.println();

        Collections.sort(personList,comparator1);
        for (Person pl:personList){
            System.out.println(pl);
        }



    }
}

class PersonNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}


class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {

        return Integer.valueOf(p1.getAge()).compareTo(p2.getAge());
    }
}
class Person{

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



}

