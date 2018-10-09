package _01.enums;

public class Notes {

    // Enum avoids magic numbers, which improves readability and understandability
// of the source code. Also, enums are typesafe constructs. Therefore, use enums
// wherever you need a set of related constants.
// eger bir veri yapisinin alabilecegi degerler belliyse/siraliysa/sinirliysa bu durumda olabildigince enum yapisini tercih ederiz.
//
// ornek olarka mevsimler 4 tanedir bunun icin enum yapisini kullanabiliriz.
// calisan tipi sinirli sayidadir, part time full time outsource vs .. enum yapisi kullanbiliriz.

// card brand sinirlidir , visa , mastercard , amex , diners ...

// islem tipi , SATIS , IADE , IPTAL gibi bu yapiyi da enum olarak tanimlayabilir.

    enum IslemTipi {
        SATIS,IADE,sIPTAL;
    }
}
