package _03.syncronized;

public class Notes {

    // syncronized javada anahtar kelimedir.
    // metotlar da ya blocklarda kullanabiliriz.

    // race condition durumundan kacinmamizi saglar.
    // her objenin bir tane kilidi vardir/lock

    // monitor lock adi verilir.intrinsic lock/esas/gercek
    // syncronized bir metoda ya da block a giris yapildiginda bu kilit ele gecirilir.
    // ilgili blocktan ya da metottan cikis olana kadar bir baska thread buraya giris yapamaz!

    // bir thread ilgili kilidi/lock i ele gecirdiginde isi bitene kadar diger threadler o bloga/metoda giremez.
    // WAITING durumunda olurlar.

    // her objenin bir kilidi vardir.
    // bir thread N tane kilide sahip olabilir.

    // bu keyword metot ve blocklar icin kullilabilir. degiskenler icin kullanilamaz.

    // static metotlar icin ;
    // her sinifa karsiliik. java.lang.Class tipinde bir obje vardir. bu obje static syncronized metotlarda lock olarak kullanilir.
}
