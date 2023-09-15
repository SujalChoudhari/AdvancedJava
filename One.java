import java.util.*;

public class One {

    public static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) { 
        Vector<String> employee = new Vector<>(10, 2);

        int count = 10;
        while(count--> 0){
            employee.add(takeNewName());
        }

        System.out.println("We need 2 more employees;");
        employee.add(takeNewName());
        employee.add(takeNewName());

        System.out.println("Due to ression we need to layoff 8th employee, Sorry");
        employee.remove(7);

        System.out.println("Ok, Great... Copying List");
        Vector<String> copied = new Vector<String>(employee);

        System.out.println("Ok here is the list");
        System.out.println("Size of copied"+ copied.size());        
        System.out.println(copied);

    }

    public static String takeNewName(){
        System.out.println("Enter an employee name: ");
        return sc.nextLine();
        // return "aa";
    }



}