import java.util.Scanner;

public class Two {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String input = "";
        while (input != "quit") {
            System.out.println("\n\n\nEnter the datatype and values, 'q u it' to exit");
            input = sc.next();
            String value = sc.next();
            String value2 = sc.next();

            switch (input) {
                case "int":
                    System.out.println("Equality of " + value + " and " + value2 + " is "
                            + isEqualTo(Integer.parseInt(value), Integer.parseInt(value2)));
                    break;
                case "double":
                    System.out.println("Equality of " + value + " and " + value2 + " is "
                            + isEqualTo(Double.parseDouble(value), Double.parseDouble(value2)));
                    break;
                case "string":
                    System.out.println("Equality of " + value + " and " + value2 + " is " + isEqualTo(value, value2));
                    break;

                default:
                    return;

            }
        }

    }

    public static <Type> boolean isEqualTo(Type one, Type two) {
        return one.equals(two);
    }
}
