package com.company;

public class Birds {
    private String name;
    private int age;
    private Color color;
    private Place place;

    public Birds(String name, int age, Color color, Place place) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Place getPlace() {
        return place;
    }

    public String getInfo() {
        return "Название птицы " + getClass().getSimpleName() + " " + getName() + "\n Возраст = "
                + getAge() + "\n Цвет " + getColor() + "\n Место обитания: "
                + getPlace().getPlace() + getPlace().getName() ;
    }
}

