package _06.variable_scope;

public class Notes {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            // i local degiskenin yasam alani sadece tanimli oldugu for ile sinirlidir.
        }

        //System.out.println(i); // compiler error
    }
}

// static -> class, JVM tarafindan yuklendiginde (load) olusur ve proje ayakta kaldigi muddetce yasar.
// instance -> obje olusunca var olur , obje garbage collector tarainfndan temizlendiginde instance degiskenin scope u son bulur.
// local -> yasam alani , ilgili method ya da code block u tamamlaninca son bulur.

// static > instance > local
