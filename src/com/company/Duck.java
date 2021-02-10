package com.company;

public final class Duck extends Parrot {
    private int paw;

    public Duck(String name, int age, Color color, Place place, int wing, int paw) {
        super(name, age, color, place, wing);
        this.paw = paw;
    }

    public int getPaw() {
        return paw;
    }

    @Override
    public void makeVoice(String voice) {
        super.makeVoice(voice);
    }

    public void ability(String swim, String fly){
        System.out.println(swim + fly);

    }

    public String getInfo2(){
        return super.getInfo1() + "\n Количество лап: " + getPaw();
    }
}




