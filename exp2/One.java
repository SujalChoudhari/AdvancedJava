import java.util.Scanner;

public class One {

    public static Scanner sc = new Scanner(System.in);

    public static <E> void printArray(E[] array) {
        System.out.println("Printing: " + array[0].getClass().getName());
        for (E item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer[4];
        Double[] doubleArray = new Double[4];
        String[] strArray = new String[4];

        int count = 0;
        System.out.println("Enter int data:");
        while (count < 4) {
            intArray[count] = sc.nextInt();
            count++;
        }

        count = 0;
        System.out.println("Enter double data:");
        while (count < 4) {
            doubleArray[count] = sc.nextDouble();
            count++;
        }

        count = 0;
        System.out.println("Enter str data:");
        while (count < 4) {
            sc.next();
            strArray[count] = sc.nextLine();
            count++;
        }

        printArray(intArray);
        printArray(doubleArray);
        printArray(strArray);

    }
}