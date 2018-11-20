package _04.genericClass;

public class GenericTypes{
    public static void main(String[] args) {

        GenericTypesTest<Integer> genericInteger = new GenericTypesTest<Integer>(10);
        GenericTypesTest<String> genericString = new GenericTypesTest<String>("string");

        System.out.println(genericInteger.getGenericTypes() );
        System.out.println(genericString.getGenericTypes());

    }

}

class GenericTypesTest<T>{

    private T genericTypes;

    public T getGenericTypes() {
        return genericTypes;
    }

    public void setGenericTypes(T genericTypes) {
        this.genericTypes = genericTypes;
    }

    public GenericTypesTest(T genericTypes) {
        this.genericTypes = genericTypes;
    }
}
