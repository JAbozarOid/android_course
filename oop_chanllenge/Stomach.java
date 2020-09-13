package oop_chanllenge;

public class Stomach extends Organ {

    private boolean isEmpty;

    public Stomach(String name, String mediacalCondition, boolean isEmpty) {
        super(name, mediacalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if (isEmpty) {
            System.out.println("need to be fed");
        } else {
            System.out.println("stomach is full");
        }
    }

    public void digest() {
        System.out.println("Digesting begin...");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
}
