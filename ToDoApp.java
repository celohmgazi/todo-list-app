import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner input = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the To-Do List App");
        do {
            System.out.println("\nAvailable commands: add, complete, list, exit ");
            System.out.println("Please enter a command: ");
            command = input.nextLine();
            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter the task description: ");
                    String description = input.nextLine();
                    System.out.println("Enter the category: ");
                    String category = input.nextLine();
                    break;

                case "complete":
                    toDoList.displayTasks();
                    System.out.println("Enter task index to mark as completed: ");
                    int index = input.nextInt();
                    input.nextLine();
                    toDoList.markTaskComplete(index);
                    break;

                case "list":
                    toDoList.displayTasks();
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command");
            }
        } while (!command.equalsIgnoreCase("exit"));
        input.close();
    }
}
