package _07.tokenezing;

public class TokenTest02 {
    public static void main(String[] args) {
        String content="test1,test2;text3;text4:text5;text6";
        String [] arrays=content.split(",|;|:");
        for (String a: arrays){
            System.out.println(a);
        }
    }
}
