package _05.wrapper;

public class Example {
    public static void main(String[] args) {
        Boolean bool1= Boolean.FALSE;
        Boolean bool2= Boolean.valueOf("Zuleyha");
        Boolean bool3=new Boolean("tRue");
        //true,tRue,.....kombinasyonlari haric diger parametreler false dondurur.

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);

        Integer i=new Integer(10);
        //Integer z=new Integer("zuzu");
        //System.out.println(z);

        Float f=new Float(10.5);
        Float fa=new Float(10.5F);

        Byte by=new Byte((byte) 10);
    }
}
