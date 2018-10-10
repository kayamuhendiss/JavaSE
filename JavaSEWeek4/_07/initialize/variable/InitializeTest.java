package _07.initialize.variable;
import java.util.Arrays;

public class InitializeTest {
    private int intVar;
    private long longVar;
    private double doubleVar;
    private float floatVar;
    private String strVar;
    private Person peson;
    private int[] intArray;
    private int[] intArrayElement = new int[3];
    private boolean boolVar;

    public int getIntVar() {
        return intVar;
    }

    public void setIntVar(int intVar) {
        this.intVar = intVar;
    }

    public long getLongVar() {
        return longVar;
    }

    public void setLongVar(long longVar) {
        this.longVar = longVar;
    }

    public double getDoubleVar() {
        return doubleVar;
    }

    public void setDoubleVar(double doubleVar) {
        this.doubleVar = doubleVar;
    }

    public float getFloatVar() {
        return floatVar;
    }

    public void setFloatVar(float floatVar) {
        this.floatVar = floatVar;
    }

    public String getStrVar() {
        return strVar;
    }

    public void setStrVar(String strVar) {
        this.strVar = strVar;
    }

    public Person getPeson() {
        return peson;
    }

    public void setPeson(Person peson) {
        this.peson = peson;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public int[] getIntArrayElement() {
        return intArrayElement;
    }

    public void setIntArrayElement(int[] intArrayElement) {
        this.intArrayElement = intArrayElement;
    }

    public boolean isBoolVar() {
        return boolVar;
    }

    public void setBoolVar(boolean boolVar) {
        this.boolVar = boolVar;
    }

    @Override
    public String toString() {
        return "InitializeTest{" +
                "intVar=" + intVar +
                ", longVar=" + longVar +
                ", doubleVar=" + doubleVar +
                ", floatVar=" + floatVar +
                ", strVar='" + strVar + '\'' +
                ", peson=" + peson +
                ", intArray=" + intArray +
                ", intArrayElement=" + intArrayElement +
                ", boolVar=" + boolVar +
                '}';
    }
}
class Person{

}
