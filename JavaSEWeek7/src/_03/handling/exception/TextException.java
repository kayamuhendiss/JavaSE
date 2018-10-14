package _03.handling.exception;

public class TextException {
    public static void main(String[] args) {
        int number=10;
        int zero=0;


        try {
            System.out.println(number/zero);
            System.out.println("Calismayan Kisim");

        }catch (ArithmeticException e)
        {
            System.out.println("catch blogu"); //buradan itibaren hata firlatilir ve alttaki satira gecmez
            System.out.println(e.getMessage());
        }
    }
}
