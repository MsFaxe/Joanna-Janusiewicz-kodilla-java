package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final private String taskName;
    final private String where;
    final private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return taskName + ", Destination: " + where + ", transport: " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
