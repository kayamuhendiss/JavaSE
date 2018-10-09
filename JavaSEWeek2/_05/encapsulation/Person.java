package _05.encapsulation;

public class Person {
    // 1) degiskenler private
    private int id;
    private String name;
    private String surname;
    // 2) public getter sette tanimla
    // 3) isimlendirme standartina uysun

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
