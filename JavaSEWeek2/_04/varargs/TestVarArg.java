package _04.varargs;

public class TestVarArg {
    public static void main(String[] args) {

        method(1);
        //
        //method(1,2);

        methodVarArg();
        methodVarArg(1);
        methodVarArg(1,5);
        methodVarArg(1,5,2);
        //var arg yapisi ile 0-N tane argumani methoda gonderebiliriz.

    }

    public static void method(int number) {

    }
    // int ...number->array
    public static void methodVarArg(int ...number){
        System.out.println(number.length);
    }
    //

    //var-arg yapisi metotat tanimlarnirsa en sonda yer almalidir!
//	public static void methodVarArg2(int ...number, int number2){
//
//	}
    // ... degiskenden once olmalidi!
    public static void methodVarArg2(int number2, int ...number){

    }
}
