package _04.returnType;

public class Notes {

    // reference type donus tipine sahip bir metot icin null deger donulebilir.
    // primitive type icin bu durum soz konusu DEGILDIR!

    public String getName(){
        return null;
    }

    public Integer getAge(){
        return null;

    }
    public int getAgee(){
       // return null; legal degil
        return 0;

    }

    public  static  int giveInt(){
        char  ch1='x';
        return  ch1;
    }
    public static double giveDouble(){
        return 1000;

    }
    //cast yapmamiz gerekli
    public static int giveIntt(){
        return ((int)1000.524);

    }

    public void voidMethod(String name,String password){
        //
        //

//        if (notAuthenticated){
//            return;
//        }
        //return 100; compile error!
    }
    public static void main(String[] args) {
        //char->16 bit unsigned
        //int 32 bit signed
       // char i=-10;negatif bir deger alamaz

        char a=65;
        System.out.println(a);

        char A1='A';
        System.out.println(A1);
        System.out.println(giveInt());
        System.out.println(giveIntt());


        int b1=10;
        int b2=4;
        System.out.println( b1/b2);
        System.out.println((double) b1/b2);

    }
}
