package com.kodilla.patterns2.observer.homework;

public class CourseMentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public CourseMentor(String username) {
        this.mentorName = username;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(mentorName + ": New task to check in: " + studentTasks.getName() + "\n"
                + " (total: " + studentTasks.getTasks().size()+ " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
