package com.example.task_01.model;

public class Greeting {
    private String timeOfDay;
    private String name;

    public Greeting(String timeOfDay, String name) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }
   public Greeting(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}


