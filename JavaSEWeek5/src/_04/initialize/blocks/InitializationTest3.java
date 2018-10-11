package _04.initialize.blocks;

public class InitializationTest3 {

    final static int var0;
    final static int var5; //compiler error
    // final static degisken tanimladigin yerde ya da static blockta ilk deger
    // atanmasi yapilmalidir

    static int var7;
    static int var1;
    static {
        var1 = 20;
        // static int var2=30; //static degisken tanimlanamaz.
        final int var3 = 40;
        var0 = 40;
        var7 = 10;
        var5 = 10;
    }

    {
        int var6 = 20;
        var7 = 30;

    }

    public static void main(String[] args) {
        System.out.println(var0);
        System.out.println(InitializationTest3.var0);

        System.out.println(var1); //compile error
        // System.out.println(var3); /compile error
        // System.out.println(var6); //compile error
    }


}
