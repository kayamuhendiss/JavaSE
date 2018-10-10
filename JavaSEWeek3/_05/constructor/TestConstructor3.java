package _05.constructor;

class Computer{
    private int price;

    public Computer(int price) {
        this.price = price;
    }
}
class Laptop extends Computer{

    public Laptop() {
        super(100);
    }
}

public class TestConstructor3 {
    public static void main(String[] args) {

    }
}
