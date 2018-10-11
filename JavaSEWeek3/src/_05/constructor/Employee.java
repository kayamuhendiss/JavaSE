package _05.constructor;

public class Employee {
    private String name;
    private String surname;
//Eger biz bir sinif icn construcyor tanimlarsak Java bizim icin otomatik const. tanimlamaz
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee() {
        System.out.println("Bos Constructor");
    }
}
