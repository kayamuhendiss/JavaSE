package _07.tokenezing;

public class TokenTest01 {
    public static void main(String[] args) {
        // Token -> simge , sembol..


        String content="test1,test2,text3,text4";
        String [] arrays=content.split(",");
        for (String a: arrays){
            System.out.println(a);
        }
    }
}
