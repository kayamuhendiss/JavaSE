package _02.stringBufferAndstringBuilder;

public class StringBufferTest2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Standard SE");
        sb.insert(9,"Edition ");
        System.out.println(sb);
        System.out.println(sb.delete(3,6));
        System.out.println(sb.delete(3,6));

        String str=sb.toString();
    }
}
