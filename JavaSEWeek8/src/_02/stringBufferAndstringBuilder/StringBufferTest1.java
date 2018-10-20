package _02.stringBufferAndstringBuilder;

public class StringBufferTest1 {
    public static void main(String[] args) {

       // StringBuffer sb="Deneme"; complie erron

        StringBuffer sb= new StringBuffer("zu");
         sb.append("ley");
         sb.append("ha ");
         sb.append("kaya");
// zu ley ha kaya bunkar gene havuzda olusur.Fakat objemiz degistigi icin  aradaki concat  islemi sonucunda olusan  objeler olusmaz
        System.out.println(sb);



        String str = "zu";
        str = str + "ley";
        str = str + "ha ";
        str = str + "kaya";

        System.out.println(str);
    }
}
