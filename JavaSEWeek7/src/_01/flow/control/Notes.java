package _01.flow.control;

public class Notes {

    //
    // kodumuzda eger cok fazla if-else blogu varsa bir seyleri yanlis yapiyor
    // olabiliriz.

    // if-else blogunu fazla sayida kullanmamiz gerekiyorsa , bu durumda switch
    // case yapisini tercih edebiliriz.

    // if(booleanExpession) { }
    // olabildigince basit olmalidir.
    //

    // boolean degiskenler icin == kontrolu kullanmak riskli olabilir. KULLANMA!
    public static void main(String[] args) {

        /*if("test".equals(getName()) &&  getAge() >15 && getGender().equals("male")) {
            System.out.println("BASARILI");

        }*/

       // yerinee
        boolean nameCheck="test".equals(getName());
        boolean ageCheck=getAge()>15;

        if(nameCheck && ageCheck) {
            System.out.println("BASARILI");

        }

        boolean test=false;
        if (test=true){
            //BUG var
        }


    }
    public static String getName(){
        return "test";
    }
    public  static int getAge(){

        return 20;
    }
    public static String getGender(){
        return "male";
    }
}
