package _10.override;
public class Example01 {
    // 1) override kavramindan bahsedebilmek icin metot isimlerinin AYNI olmasi lazim!
// 2) kalitim/extends , implements durumu olmasi gerekli
// 3) Override metotlarda parametreler AYNI OLMALIDIR!
// 4) override metotlarda access level azalamaz, artabilir!
// 5) metot donus tipi degisemez (covariant return haric)
// 6) final veya private metodu override edemeyiz!
// final keywordu  engel olur. private memberlar  sadece tanimli oldugu sinifta gorunur(visible)
// subclassta visible degildir.
}
class Car {


    public String getModelById(int id){
        return "Model1";
    }

    String getColor(int id){
        // degiskenlerde metot icerisinde acces level kullanilmaz
        //public int a=10;
        return "Blue";
    }

    double getPrice () {
        return 100.0;
    }

    private String engineModel(){
        return "enginev1";
    }
}

class BMW extends Car{

    //@Override //OVERRIDE degil metot ismi degisti!
    public String getModelByIdX(int id){
        return "Model1";
    }

    //@Override // OVERRIDE DEGIL , parametre listesi degisti OVERLOADED!
    public String getModelById(int id, int t){
        return "Model1";
    }

    //legal degildir , metot public se default yapamayiz!!!!
//	String getModelById(int id){
//		return "Model1";
//	}


    // public > protected > default > private
    @Override
    protected String getColor(int id){
        return "Blue";
    }

    //legal degildir! override metotlarda donus tipi degismez.
//	int getPrice () {
//		return 100.0;
//	}

    //@Override // OVERRIDE DEGILDIR!!!
    //
    private String engineModel(){
        return "enginev1";
    }
}


