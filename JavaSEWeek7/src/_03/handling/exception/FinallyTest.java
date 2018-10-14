package _03.handling.exception;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        }finally {
            System.out.println("finally");

        }


        try {
            throw  new NullPointerException();
        }finally {
            System.out.println("finally work");
            //finally blogu , hata olsun ya da olmasin calisacaktir!
            //

        }
    }
}
