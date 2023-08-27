package br.com.isaacandrade.taskmanager.models;

import java.time.LocalDate;

public class Task {
    private final String description;
    private final LocalDate dateLimit;
    private boolean concluded;

    public Task(String description, LocalDate dateLimit) {
        this.description = description;
        this.dateLimit = dateLimit;
        this.concluded = false;
    }

    public void markAsCompleted(){
        this.concluded = true;
    }

    @Override
    public String toString() {
        String status = concluded ? "Concluded" : "Pending";
        return description + " (Date limit: " + dateLimit + ") - " + status;
    }
}
