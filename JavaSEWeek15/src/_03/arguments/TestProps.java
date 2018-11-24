package _03.arguments;

import java.util.Properties;

public class TestProps {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		String property = props.getProperty("keyProp");
		System.out.println("property : " + property);
	}
}
