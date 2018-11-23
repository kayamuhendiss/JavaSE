package _01.race.condition;

public class Notes  {


    // atomic -> bolunmeyen islem

    //counter++; stament

    // 1)counter degeri okunur.
    // 2)counter degeri bir artirilir.
    // 3)counter degeri guncellenir/yazilir.

    // T1 threadi calistiginda , bu uc adimindan tek seferde calisacaginin bir GARANTISI YOKTUR!
    // ornegin adim1 , adim2 calisir sonrasinda durabilir, bir baska thread calistiktan sonra tekrar calisabilir.


    class Counter2 {
        private  long count = 0;
        public void add(long value){
            this.count = this.count + value;
        }
    }

    // 2 tane thread olsun; T1 ve T2
    // T1 geldi , hafizadan count degerini okudu (0)
    // T2 geldi , hafizadan count degerini okudu (0)
    // T1 calismaya devam etsin , value 2 olsun , 2 degerini ekler.
    // sonrasinda kaydeder. this.count =2 oldu.
    // T2 calismaya devam etsin , value 3 olsun , T2 bu degeri 0 olarak almisti.
    // toplama islemini yapacak this.count = 3 olacaktir.
    // burada guncel deger 5 olmasi gerekirken , count degeri 3 oldu.

    // birden fazla thread ayni obje referansi uzerinden , ayni kaynaga erisim saglayip degistirmek istediginde , race condition durumu ortaya cikabilir.


    // thread safe -> bir den fazla thread ayni anda/es zamanli olarak metoda/block a erismeye calistiginda problem olmamasi anlamina gelir.
    // problemler ; race condition , deadlock , memory consistency error , livelock  vs
    //
    // local variable -> thread safe ozellik gosterirler.
    // her local degisken stacte yasar. her threadin kendine ozgu bir stack alani vardir.
    // local degiskenler paylasilmadi icin problem arz etmez!

    //public void mymethod() {
    //	int localVariable;
    //	localVariable++;
}
