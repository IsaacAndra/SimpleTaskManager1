package br.com.isaacandrade.taskmanager.models;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listTask() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markTaskAsCompleted(int index){
        if(index >= 1 && index <= tasks.size()){
            tasks.get(index - 1).markAsCompleted();
            System.out.println("Task marked as concluded.");
        }else{
            System.out.println("Invalid index");
        }
    }
}
