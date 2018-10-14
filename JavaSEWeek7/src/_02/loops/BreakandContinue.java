package _02.loops;

public class BreakandContinue {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){

            if (i%2==0){
                continue;
                //i%2==0 oldugunda atlar ve devam eder
            }
            if (i==7){
                break;
                //donguyu kirar
            }
            System.out.println(i);
        }

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("Word");
                break;
            }
        }

        //disaridaki donguyu kirmak icin
        System.out.println("labeled break");
        mylabel:for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("Word");
                break mylabel;
            }
        }

    }
}
