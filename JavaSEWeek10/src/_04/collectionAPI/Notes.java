package _04.collectionAPI;

import java.util.ArrayList;

public class Notes {


// Collection API

// java.util paketinde yer alirlar.

// public interface Collection<E> extends Iterable<E> {

// java.util.List (public interface List<E> extends Collection<E> {)
// java.util.Set (public interface Set<E> extends Collection<E> {)
// java.util.Map (public interface Map<K,V> {)

// IS-A olarak Map IS-A Collection degildir.
// fakat Collection API dedigimizde aklimiza Map de gelir.
// Map ler List ler le birlikte en cok kullanilan veri yapilaridir.


// Ordered & Unordered
// ordered /sirali olmasi , elemanlarin belirli bir sirada eklenmesi anlamian gelir.
// index-based

// java.util.ArrayList , ordered bir yapiya sahitir. elemanlar eklendigi sirada tutulur!

// java.util.HashMap ise unordered bir yapiya sahiptir.elemanlarin hangi sirada tutulacagi onceden bilinemez.

// Sorted & Unsorted
// sorted/siralanmis olmasi , elemanlarin sirali sekilde olmasi anlamina gelir.

// natural order mantigi
// -numerik siralama
// -sozluk/dictionary mantiginda siralama

// java.util.TreeMap ve java.util.TreeSet sorted ozellige sahiptir.

// ----------------------------
// java.util.List
// java.util.ArrayList
// java.util.LinkedList
// java.util.Vector

// ordered ozellik gosterir , elemanlari eklendigi sirada tutulur!


// ### java.util.List
// ArrayList , hizli iteration , random access olarak , LinkedList ten daha hizlidir.
// LinkedList , fast insert/delete islemi noktasinda ArrayList ten daha hizlidir./verimlidir.
// LinkedList IS-A Queque
// Vector , JDK1.0 dan beri vardir. metotlari synchronized dir. Thread Safe ozellik gosterir.
// public synchronized boolean add(E e) {

// ### java.util.Set
// Set -> kume anlamina gelmektedir.
// duplicate elemana IZIN VERMEZLER!!!

// java.util.HashSet
// java.util.LinkedHashSet
// java.util.TreeSet

// HashSet -> unordered ozelik gosterir.
// LinkedHashSet -> ordered ozellik gosterir. elemanlar eklendigi sirada tutulur.
// TreeSet -> sorted ozellik gosterir. yani elemanlar sirali sekilde tutulur(natural order)


// java.util.Map
// key/value cifti soz konusudur.
// key duplicate olamaz , unique olmak zorundadir!
// value ise duplicate olabilir.

//MAP
//----synchronized
//TCKN (key) , Person objesi(value) (TCKN , name , surname , age ...)
//11111       Person1 objesi
//11112       Person2 objesi
//11113       Person3 objesi


// java.util.HashMap -> unordered bir yapiya sahiptir. (HashSet e benzer)
// java.util.LinkedHashMap -> ordered bir yapiya sahiptir (LinkedHashSet e benzer) , elemanlari eklenildigi sirada tutar.
// java.util.TreeMap -> sorted bir yapiya sahiptir. (TreeSet e benzer) elemanlari sorted yapida tutulur.
// key degerine gore sort eder!

// java.util.Hashtable
// JDK 1.0 dan beri vardir.
// ismi standarda uymaz , Hashtable degil HashTable seklinde olmali.
// Vector sinifi gibi bu sininfinda metotlari synchronized ozellik gosterir (daha yavas calisir). thread safetir.
// Kullanilmasi onerilmez!

// Hashtable null key yada null value degerine izin vermez!!! NullPointerException atar!
// HashMap 1 tane null key sahip olabilir. N tane null value 'ya sahip olabilir.


// java.util.Queue
// java.util.PriorityQueue FIFO (First in First OUT)

//
public static void main(String[] args) {
    ArrayList<String> isimler = new ArrayList<String>();
}

}
