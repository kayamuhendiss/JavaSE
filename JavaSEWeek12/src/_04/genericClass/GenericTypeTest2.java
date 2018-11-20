package _04.genericClass;


public class GenericTypeTest2<T> {
    public static <T> void genericMethod(T[] array){

        for (T element:array){
            System.out.print(element+" ");
        }

    }

    public void generic(T t){}

    public static void main(String[] args) {
        Integer[] i = { 1, 2, 3, 4, 6 };
        Double[] d = { 1.5, 2.5, 3.6, 4.4, 6.67 };
        Boolean[] b = {true, false, true};
        //Person[] p = { new Person() , new Person()};

        genericMethod(i);
        genericMethod(d);
        genericMethod(b);
    }
}
