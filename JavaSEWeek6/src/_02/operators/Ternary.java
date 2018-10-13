package _02.operators;

public class Ternary {

    // x = (boolean expression) ? assign if true : assing if false

    public static void main(String[] args) {
        int exam = 80;
        String result = exam < 50 ? "Fail" : "success";

//		if(exam<50){
//			result = "fail";
//		}else {
//			result ="success";
//		}
//
        System.out.println(result);
    }
}
