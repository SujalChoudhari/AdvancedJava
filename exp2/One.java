import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static Scanner sc = new Scanner(System.in);

    public static <E> void printArray(ArrayList<E> array) {
        System.out.println("Printing: " + array.get(0).getClass().getName());
        for (E item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        ArrayList<Double> doubleArray = new ArrayList<Double>();
        ArrayList<String> strArray = new ArrayList<String>();

        int count = 0;
        System.out.println("Enter int data:");
        while (count < 4) {
            intArray.add(sc.nextInt());
            count++;
        }

        count = 0;
        System.out.println("Enter double data:");
        while (count < 4) {
            doubleArray.add(Double.parseDouble(sc.nextLine()));
            count++;
        }

        count = 0;
        System.out.println("Enter str data:");
        while (count < 4) {
            strArray.add(sc.nextLine());
            count++;
        }

        printArray(intArray);
        printArray(doubleArray);
        printArray(strArray);

    }
}