package _01.flow.control;

public class SwitchCaseNotes {
    public static void main(String[] args) {
        /*switch (key) {
		case value:

			break;

		default:
			break;
		}*/
        int key=2;
        switch (key) {
		case 1:
            System.out.println("case1");

        case  2:
            System.out.println("case2");



		default:
            System.out.println("default" +
                    "");
			break;
		}

    }
}
