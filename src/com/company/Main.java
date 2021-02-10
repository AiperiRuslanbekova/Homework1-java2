package com.company;

public class Main {

    public static void main(String[] args) {

        Parrot objectA = new Parrot("Ара",3, Color.RED, new Place("дома", " в клетке"), 2);
        System.out.println(objectA.getInfo1());
        objectA.makeVoice("Чик чирик... ", "Привет друг! ");

        System.out.println("---------------------");

        Duck objectB = new Duck("Дональд Дак",7,Color.PURPLE,new Place("озеро", " Мичиган"), 2,2);
        System.out.println(objectB.getInfo2());
        objectB.makeVoice("Кря кря...");

        System.out.println("----------------------");

        Duck objectC = new Duck("Дональд Дак",7,Color.PURPLE,new Place("озеро", " Мичиган"), 2,2);
        System.out.println(objectC.getInfo2());
        objectC.ability("Плавает, ", "Летает");
    }
}
