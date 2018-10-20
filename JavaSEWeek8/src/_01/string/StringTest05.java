package _01.string;

public class StringTest05 {
    public static void main(String[] args) {
        String str = "";

        System.out.println(str.length());
        System.out.println(str.isEmpty());

        str = "hello_world";

        System.out.println(str.length());
        System.out.println(str.isEmpty());

        char c = str.charAt(2);
        System.out.println(c);

        System.out.println(str.codePointAt(3));

        byte [] bytes = str.getBytes();

        System.out.println();
        for(byte b : bytes){
            System.out.println(b);
        }

        // String objelerini equals ile karsilastir!!!


        String name1 = "admin";
        String name2 = "admin";

        System.out.println(name1.equals(name2));

        String name3 = new String("ADMIN");

        System.out.println(name1.equalsIgnoreCase(name3));


        String java = "ZuleyhaKaya";

        System.out.println(java.substring(1, 5)); // [ ) , baslangic dahil , bitis haric

        //
        System.out.println(java.toUpperCase());
    }
}
