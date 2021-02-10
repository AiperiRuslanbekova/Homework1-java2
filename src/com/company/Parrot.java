package com.company;

public class Parrot extends Birds {
    private int wing;

    public Parrot(String name, int age, Color color, Place place, int wing) {
        super(name, age, color, place);
        this.wing = wing;
    }

    public int getWing() {
        return wing;
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    public final void makeVoice(String voice, String say){
        System.out.println(say + voice);
    }

    public String getInfo1(){
        return super.getInfo() + "\n Количество крыльев: " + getWing();
    }
}
