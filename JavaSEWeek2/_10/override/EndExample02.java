package _10.override;

public class EndExample02 {
    public static void main(String[] args) {
        EndExample variableSmall=EndExample.SMALL;
        EndExample variableLarge=EndExample.LARGE;
        EndExample variableXLarge=EndExample.XLARGE;
        EndExample variableMeidum=EndExample.MEDIUM;

        System.out.println(variableSmall);
        System.out.println(variableMeidum);

        for (EndExample e:EndExample.values()){
            System.out.println(e+" : "+e.getLimited());
        }
    }
}
