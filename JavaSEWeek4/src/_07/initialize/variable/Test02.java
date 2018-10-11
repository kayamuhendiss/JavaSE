package _07.initialize.variable;
class Employee {

    private String name; //instance degisken , referecen type , otomatik olarak null degeri assign edilir!

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Test02 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getName());
        System.out.println(employee.getName().toUpperCase());
        // null degere sahip bir instance variable uzerinden , instance methoda gitmeye kalktimizda bu hatayi aliriz!
        // java.lang.NullPointerException
    }
}
