package exercises;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
       HashMap<Integer, String> students = new HashMap<>();
       Scanner input = new Scanner(System.in);
       String newName;

       System.out.println("Enter your students or press ENTER to finish: ");

       do {
           System.out.println("Name: ");
           newName = input.nextLine();
           if (!newName.equals("")) {
               System.out.println("Id: ");
               Integer newId = input.nextInt();
               students.put(newId, newName);

               input.nextLine();
           }
       } while (!newName.equals(""));

//       do {
//           System.out.print("ID: ");
//           newId = input.nextInt();
//           if (!newId.equals("")) {
//               System.out.print("Student: ");
//               String newStudent = input.nextLine();
//               students.put(newId, newStudent);
//
//               input.nextInt();
//           }
//       } while (newId.equals(""));

       System.out.println("\nClass roster: ");
       for (Map.Entry<Integer, String> student : students.entrySet()) {
           System.out.println(student.getKey() + " " + student.getValue());
       }
    }
}
