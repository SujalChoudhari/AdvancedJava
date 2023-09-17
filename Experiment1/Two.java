import java.util.ArrayList;
import java.util.Scanner;

/*
    In this problem we have given you three classes in the editor: 
    - Student class 
    - Rockstar class 
    - Hacker class 
    In the main method, we populated an ArrayList with several instances of these classes. count method calculates how many instances of each type is present in the ArrayList. (Use instanceof) 
*/

class Student {
    public String toString() {
        return "Student";
    }
}

class Rockstar {
    public String toString() {
        return "Rockstar";
    }
}

class Hacker {
    public String toString() {
        return "Hacker";
    }
}

public class Two {
    public static void main(String[] args) {
        ArrayList<Object> listOPersons = new ArrayList<Object>();

        // Simulating Sample Input
        String ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: (quit) to quit entering data");
        while (true) {
            System.out.print(">> ");
            ans = sc.next();
            if (ans.contains("quit"))
                break;

            switch (ans) {
                case "Student":
                    listOPersons.add(new Student());
                    break;
                case "Rockstar":
                    listOPersons.add(new Rockstar());
                    break;
                case "Hacker":
                    listOPersons.add(new Hacker());
                    break;
            }
        }

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;
        for (Object ins : listOPersons) {
            if (ins instanceof Student) {
                studentCount++;
            } else if (ins instanceof Rockstar) {
                rockstarCount++;
            } else if (ins instanceof Hacker) {
                hackerCount++;
            }
        }
        System.out.println(listOPersons);
        System.out.println("There are " + studentCount + " students ");
        System.out.println(rockstarCount + " rockstars ");
        System.out.println(hackerCount + " hackers ");

    }
}
