import java.util.*;

class Student {
    int roll;
    String name;
    int age;

    Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n--- STUDENT MANAGEMENT ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Roll No: ");
                    int r = sc.nextInt();
                    System.out.print("Name: ");
                    String n = sc.next();
                    System.out.print("Age: ");
                    int a = sc.nextInt();
                    list.add(new Student(r, n, a));
                    System.out.println("Student added!");
                    break;

                case 2:
                    for (Student s : list)
                        System.out.println(s.roll + "  " + s.name + "  " + s.age);
                    break;

                case 3:
                    System.out.print("Enter roll to search: ");
                    int sr = sc.nextInt();
                    boolean found = false;
                    for (Student s : list) {
                        if (s.roll == sr) {
                            System.out.println(s.name + ", Age: " + s.age);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;

                case 4:
                    System.out.print("Enter roll to delete: ");
                    int dr = sc.nextInt();
                    list.removeIf(s -> s.roll == dr);
                    System.out.println("Deleted if existed.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
