import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    // Att
    private ArrayList<String> tasks;
    private Scanner scanner;
    // constructor
    public ToDoListManager() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    // method
    public void start(){
        boolean start = true;
        while (start){
        System.out.println("\n--- Welcome In My To-Do List Manager ---");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Clear All Tasks");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        switch (userChoice){
            case 1:
                addTask();
                break;
            case 2:
                removeTask();
                break;
            case 3:
                viewTasks();
                break;
            case 4:
                clearAllTasks();
                break;
            case 5:
                System.out.println("Exiting To-Do List Manager. Goodbye!");
                start = false ;
            default:
                System.out.println("Invalid choice. Please try again.");}
        }
    }
            private void addTask(){
                System.out.println("Enter Your Task : ");
                String userTask = scanner.nextLine();
                tasks.add(userTask);
                System.out.println("The Task Added");
            }
            private void removeTask(){
                System.out.println("Enter The Index Ior Task You Want To Delete It  : ");
                int userTaskIndex = scanner.nextInt();
                scanner.nextLine();
                if (userTaskIndex >= 0 && userTaskIndex<tasks.size()){
                    tasks.remove(userTaskIndex);
                    System.out.println("The Task Added");
                }
                else {
                    System.out.println("Invalid index. Please try again.");
                }

            }
            private void viewTasks() {
                if (tasks.isEmpty()) {
                    System.out.println("Your to-do list is empty.");
                } else {
                    System.out.println("\nYour To-Do List:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ": " + tasks.get(i));
                    }
                }
            }
            private void clearAllTasks(){
                tasks.clear();
                System.out.println("All Tasks Removed ");

            }


}
