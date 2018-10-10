package _01.constructor;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    private Person(){

        // private olmasina ornekler
        // singleton design pattern
        // utility classlari -> java.lang.Math
        // builder pattern


    }

    //BU YAPILANDIRICI DEGILDIR METOTTUR!
    // This method has a constructor name
    public void Person(int age){

    }

    public Person(int age){


    }//yapilandiriclarin donus tipi olamaz


    // bir yapilandirici hem super hem de this(..) yapisina sahip olamaz!
    // this (..) yapisi da super gibi ilk calisan ifade olmalidir.

}
