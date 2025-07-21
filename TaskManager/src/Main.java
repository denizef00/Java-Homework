import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("---TASK MANAGER SYSTEM---");
            System.out.println("1.Task Add");
            System.out.println("2.Task List");
            System.out.println("3.Complete Task");
            System.out.println("4.Remove Task");
            System.out.println("5.Exit");
            System.out.print("Select your command index: ");
            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select){
                case 1 -> {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Description: ");
                    String desc = scanner.nextLine();

                    System.out.println("Due Date (YYYY-MM-DD): ");
                    String dateInput = scanner.nextLine();

                    try {
                        LocalDate dueDate = LocalDate.parse(dateInput);
                        Task task = new Task(title,desc,dueDate);
                        manager.newTask(task);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date input. Please enter like this YYYY-AA-GG.");
                    }
                }

                case 2 -> manager.listTasks();

                case 3 -> {
                    manager.listTasks();
                    System.out.println("Please select index which task completed: ");
                    int index = scanner.nextInt() - 1;
                    manager.completeTask(index);
                }

                case 4 -> {
                    manager.listTasks();
                    System.out.println("Please selecet index which task removed: ");
                    int index = scanner.nextInt() - 1;
                    manager.deleteTask(index);
                }

                case 5 -> {
                    running = false;
                    System.out.println("EXIT!!");
                }

                default -> System.out.println("Invalid Command!!");

            }
        }

    }
}
