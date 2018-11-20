package _05.nested;

public class OuterClass {

    // outer class -> inner class in private  uyelerine erisim saglayabilir.
    // inner class -> outer class in private uyelerine erisim saglayabilir.

    private String name="tester";

    private  class RegularInnerClass{

        private String password="1234";
       //  private static String compilerError="test";

        private void printMessage(){
            System.out.println(name);  //private uyelere erisim saglayabilir
        }

    }

    private static String nameStatic="static tester";


    static class StaticNestedClass{

        private String name1="test2";
        private static String name2="test3";
        //static nested classta static degisken tanimlanabilir.

    }

    public static void main(String[] args) {

        //System.out.println(name);  // compiler error



        // RegularInnerClass in=new RegularInnerClass();  // compiler error

        OuterClass outerClass=new OuterClass();
        RegularInnerClass inner=outerClass.new RegularInnerClass();

        inner.printMessage();

        OuterClass.RegularInnerClass inner2=outerClass.new RegularInnerClass();
        OuterClass.RegularInnerClass inner3=new OuterClass().new RegularInnerClass();


        System.out.println(outerClass.name);

        System.out.println(nameStatic);
        StaticNestedClass staticNestedClass=new StaticNestedClass();
    }

    public void createInnerObject(){
        RegularInnerClass reg=new RegularInnerClass();
        System.out.println(reg.password);

    }
}
