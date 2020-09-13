package oop_chanllenge;

public class Heart extends Organ {

    private int rate;

    public Heart(String name, String mediacalCondition, int rate) {
        super(name, mediacalCondition);
        this.rate = rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Rate: " + this.rate);
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


    
}
