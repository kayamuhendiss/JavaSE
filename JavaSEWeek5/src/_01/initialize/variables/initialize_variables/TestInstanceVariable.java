package _01.initialize.variables.initialize_variables;

import java.util.Arrays;

public class TestInstanceVariable {

	private int intVariable;
	private Integer integerVariable;
	private byte byteVariable;
	private double doubleVariable;
	private String stringVariable;
	private boolean booleanVariable;
	private int[] intArray;
	
	@Override
	public String toString() {
		return "TestInstanceVariable [intVariable=" + intVariable + ", integerVariable=" + integerVariable
				+ ", byteVariable=" + byteVariable + ", doubleVariable=" + doubleVariable + ", stringVariable="
				+ stringVariable + ", booleanVariable=" + booleanVariable + ", intArray=" + Arrays.toString(intArray)
				+ "]";
	}



}
