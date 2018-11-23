package _04.deadlock;

public class Notes{
    // deadlock ;
    // 2 veya daha fazla threadin birbirini blocklamasi durumudur.
    //

    // Thread1 A kilidini ele gecirsin
    // Thread2 B kilidini ele gecirsin

    // ...
    // Thread1 B kilidine ihtiyac duyuyor, Thread2 nin B kilidini birakmasini bekliyor.
    // Thread2 A kilidine ihtiyac duyuyor, Thread1 nin A kilidini birakmasini bekliyor.
    // bu durumda karsilikli olarak threadler birbirlerini sonsuza kadar beklerler.
    // deadlocktan kacinmak icin locklarin alinmasi sirasi ayni yapilabilir.
}
