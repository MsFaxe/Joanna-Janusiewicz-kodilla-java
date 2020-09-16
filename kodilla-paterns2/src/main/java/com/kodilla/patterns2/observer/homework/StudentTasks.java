package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements Observable{
    private final List<Observer> mentors;
    private final List<String> tasks;
    private final String name;

    public StudentTasks(String name) {
        mentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: mentors) {
            observer.update(this);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
