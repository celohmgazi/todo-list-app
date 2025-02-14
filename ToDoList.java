import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList(){
        tasks = new ArrayList<>();
    }
    public void addTask(String  description, String category){
        Task newTask = new Task(description, category);
        tasks.add(newTask);
        System.out.println("Task added: " + description);
    }
}
