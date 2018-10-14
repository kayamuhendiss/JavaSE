package _03.handling.exception;

public class TestNullPointerException {
    public static void main(String[] args) {
        // handle or declare kurali unchecked exceptionlar icin zorunlu
        // degildir!
        //

        String username = getName();
        //KOTU YAKLASIM!!!

        try {
            if (username.equals("admin")) {
                //

            }
        } catch (NullPointerException e) {
            System.out.println("exception catch!");
        }

        if ( username != null && username.equals("admin")){

        }

        // Bu yaklasim daha iyi bir yaklasimdir!
        if("admin".equals(username)){

        }

        Animal animal = new Cat();
        //burada try catch arasina almak yerine kodu fixlememiz gereklidir!
        //Dog dog = (Dog) animal;

    }
    public static String getName() {

        //
        return null;
    }
}
class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

