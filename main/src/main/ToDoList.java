package main;

import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, String category) {
        Task newTask = new Task(description, category);
        tasks.add(newTask);
        System.out.println("Task added: " + description);
    }

    public void markTaskComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Task completed: " + tasks.get(index).getDescription());
        } else {
            System.out.println("No task found");
        }
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + ": " + tasks.get(i)));
        }
    }
}
