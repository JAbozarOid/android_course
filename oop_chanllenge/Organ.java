package oop_chanllenge;

public class Organ {
    private String name;
    private String mediacalCondition;

    public Organ(String name, String mediacalCondition) {
        this.setName(name);
        this.setMediacalCondition(mediacalCondition);
    }

    public String getMediacalCondition() {
        return mediacalCondition;
    }

    public void setMediacalCondition(String mediacalCondition) {
        this.mediacalCondition = mediacalCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void getDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.mediacalCondition);
    }
}
