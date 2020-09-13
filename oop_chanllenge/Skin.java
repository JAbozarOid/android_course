package oop_chanllenge;

public class Skin extends Organ {

    private String color;
    private int softness;

    public Skin(String name, String mediacalCondition, String color, int softness) {
        super(name, mediacalCondition);
        this.setColor(color);
        this.setSoftness(softness);
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
}
