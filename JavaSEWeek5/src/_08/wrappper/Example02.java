package _08.wrappper;

public class Example02 {
    public static void main(String[] args) {
        Short s=100;
        test(s);
    }
   //Short IS-A Integer degıldir
    public static void test(Integer i){
        System.out.println("Integer");
    }
    //Short IS-A Object
    public static void test(Object i){
        System.out.println("Object");
    }
    public static void test(short i){
        System.out.println("Short");
    }
}
