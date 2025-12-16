import java.util.List;
import java.util.Scanner;

//PR

public class Main {
    public static void main(String[] args) {


        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("====== STUDENT MANAGER ======");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Update student");
            System.out.println("4. Deactivate student");
            System.out.println("5. Show all students");
            System.out.println("6. Search students");
            System.out.println("7. Clear all");
            System.out.println("8. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter group: ");
                    String group = scanner.nextLine();
                    System.out.print("Enter score: ");
                    double score = scanner.nextDouble();
                    scanner.nextLine();
                    manager.addStudent(name, group, score);
                    System.out.println("Student added successfully.");
                }


                case 2 -> {
                    System.out.print("Enter student ID to remove: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    manager.removeStudent(id);
                    System.out.println("Operation completed.");
                }

                case 3 -> {
                    System.out.print("Enter student ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter new group: ");
                    String group = scanner.nextLine();
                    System.out.print("Enter new score: ");
                    double score = scanner.nextDouble();
                    scanner.nextLine();
                    manager.updateStudent(id, name, group, score);
                    System.out.println("Operation completed.");
                }

                case 4 -> {
                    System.out.print("Enter student ID to deactivate: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    manager.deactiveStudent(id);
                    System.out.println("Operation completed.");
                }

                case 5 -> {
                    manager.showAll();
                }

                case 6 -> {
                    System.out.print("Enter search keyword: ");
                    String keyword = scanner.nextLine();
                    List<Student> results = manager.search(keyword);
                    if (results.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("Found students:");
                        for (Student s : results) {
                            System.out.println(s);

                        }
                    }
                }

                case 7 -> {
                    manager.clearAll();
                }

                case 8 -> {
                    System.out.println("Exiting program");
                    return;
                }

                default -> System.out.println("Invalid choice!");


            }


        }


    }
}