import java.util.*;

class Task {
    String name;
    boolean done;

    Task(String name) {
        this.name = name;
        this.done = false;
    }
}

public class ToDo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<>();

        while (true) {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Completed");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter task: ");
                    list.add(new Task(sc.next()));
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.print("Task number: ");
                    int m = sc.nextInt() - 1;
                    if (m >= 0 && m < list.size())
                        list.get(m).done = true;
                    else
                        System.out.println("Invalid task!");
                    break;

                case 3:
                    System.out.print("Task number: ");
                    int d = sc.nextInt() - 1;
                    if (d >= 0 && d < list.size())
                        list.remove(d);
                    else
                        System.out.println("Invalid task!");
                    break;

                case 4:
                    int i = 1;
                    for (Task t : list) {
                        String status = t.done ? "[X]" : "[ ]";
                        System.out.println(status + " " + i + ". " + t.name);
                        i++;
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
