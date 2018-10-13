package _01.garbage.collection;

public class Notes {
    // Garbage colelction mekanizmasi , kaynak yonetiminin adidir.
/// memory yonetimi
// herhangi bir program calistiginda mutlaka ram kullamnimi soz konusu olacakgtir.

// C gibi bir dilde calloc , malloc ,free gibi fonksiyonlarla yapiyoruz.

// Javada ise memory yonetimi/kaynak yonetimi Garbage Collector tarafindan yapilmaktadir.
// boylece memory leaklerin onune gecilmektedir. bu da javanin robust olma ozelligini saglar.

// bir baska nokta olarak , calloc , malloc , free pointer gibi kavramlarla ugrasmioruz bu da javanin simple(basit) ozelligini saglamaktadir.
// JVM (java virtual machine) , mini bir isletim sistemi gibi calisir,
// Isletim sistemleri kaynak paylasimi yapar , JVM de kendine ayrilmis kaynaklardan sorumludur.

// Javada objeler heap memoryde yasarlar.
// instance degiskenler de obje ile birlikte heapte yasarlar.

// Garbage Collector , Heap'te bulunan ve ulasilamayan/sahipsiz objeleri heapten temizlemekten sorumludur.
// boylece yeni objeler icin yer ayrilir.

// Garbage Collector , JVM in kontrolu altindadir.
// Garbage Colector mekanizmasinin ne zaman calisacagi JVM kontorlu altindadir.

}
