package _02.operators;

public class LogicatlOperator {
    public static void main(String[] args) {
        int i = 5;

        if(i<10 || i/0>1) {
            System.out.println("true");
        }

// && ilk i>10 durumda yanlis oldugu icin icine girmez
        if(i>10 && i/0>1) {
            System.out.println("true");
        }

        if(3<4 && 3<6) {
            System.out.println("true");
        }


    }
}
