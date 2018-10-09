package _05.encapsulation;

public class GoodEncapsulation {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number<0){
            number=0;
        }
        this.number = number;
    }
}
