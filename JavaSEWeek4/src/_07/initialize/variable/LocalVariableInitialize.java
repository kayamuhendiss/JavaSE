package _07.initialize.variable;

public class LocalVariableInitialize {
    public static void main(String[] args) {
        // local degiskenler -> stackte yasarlar!
        // local degiskenler icin initialize islemi YAPILMAZ!

        int number = 0;
        int number2 = 0;

        int sum = number + number2;

//		String name; // nul degildir! uninitialize durumdadir!
//
//		if(name == null){
//
//		}

        String name = null;

        if(name == null){

        }

    }
}
