package br.com.isaacandrade.taskmanager.main;

import br.com.isaacandrade.taskmanager.models.Task;
import br.com.isaacandrade.taskmanager.models.TaskManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Clean the room", LocalDate.parse("2023-08-31"));
        Task task2 = new Task("Study OOP", LocalDate.parse("2023-09-05"));

        manager.addTask(task1);
        manager.addTask(task2);


        manager.markTaskAsCompleted(1);

        manager.listTask();
    }
}
