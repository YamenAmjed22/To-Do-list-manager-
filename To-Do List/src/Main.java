import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoListManager manager = new ToDoListManager();
        System.out.println(" Open To-Do List Manager ? y/n ");
        Scanner scanner = new Scanner(System.in);
        char i = scanner.nextLine().charAt(0);
        if (i =='y'){
        manager.start();}
        else{
            System.out.println("good by ");
        }
    }
}