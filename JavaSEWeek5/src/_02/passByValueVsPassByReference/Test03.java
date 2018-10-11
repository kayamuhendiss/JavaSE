package _02.passByValueVsPassByReference;

public class Test03 {
    public static void main(String[] args) {
        int number=10;
        System.out.println(number);
        changeNumver(number);
        System.out.println(number);

        int age=20;
        System.out.println(age);
        age=changeMethod(age);
        System.out.println(age);

    }
    public static void changeNumver(int number){
        number=number+20;
        System.out.println(number);

    }
    public static int changeMethod(int ageMethod){
        ageMethod++;
        return ageMethod;
    }
}
