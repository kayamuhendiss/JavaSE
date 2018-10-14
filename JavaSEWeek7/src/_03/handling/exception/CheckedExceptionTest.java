package _03.handling.exception;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("file.txt");


        //IOException bir checked Exceptiondir!

//	    public FileWriter(String fileName) throws IOException {
//	        super(new FileOutputStream(fileName));
//	    }

        // checked exceptionlar icin handle or declare kuralina uymamiz gerekmeketdir!

        // yani , bir checked exception firlatan method/constructori kullandigimizda (throws) ;
        // bu durumda iki yoldan birini uygulamamiz gerekir ;
        // 1 - handle ( try catch arasina al)
        // 2 - declare (metoda throws olarak ekle)

        // bu kurala uymamiz gereklidir aksi durumda derleme hatasi/compile error aliriz!

        // gramer olarak unchecked exceptionlari da throws ile firlatabiliriz (pratik oalrak YAPILMAZ)
        // bu kural unchecked exceptionlar icin gecerli degildiR!!!


        //SQLException bir checked exceptiondir ( IS-A RuntimeException DEGIL)
        // o yuzden bu metodu kullanmak istedigimizd
        try {
            testConnectıon();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //NullPointerException bir unchecked exceptiondir.
        // NullPointerException IS-A RuntimeException
        // unchecked exception icin handle or declare kurali gecerli degildir!!!
        testUnchecked();
    }
    public  static  void testConnectıon() throws SQLException{
        //

    }
    public  static  void testUnchecked() throws NullPointerException{

        //

    }
}
