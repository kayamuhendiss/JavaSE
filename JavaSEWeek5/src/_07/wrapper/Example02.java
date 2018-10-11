package _07.wrapper;

public class Example02 {
    public static void main(String[] args) {
        Integer number1=new Integer(100);
        Integer number2=new Integer(100);

        System.out.println(number1==number2);
        System.out.println(number1.equals(number2));


        //WRAPPER ve STRING icin == yerine equals kullan!
    }
}
