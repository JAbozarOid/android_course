package oop_chanllenge;

public class Eye extends Organ {
    private String color;
    private boolean isOpen;

    public Eye(String name, String mediacalCondition, String color, boolean isOpen) {
        super(name, mediacalCondition);
        this.color = color;
        this.setOpen(isOpen);
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.color);
    }

    public void open() {
        this.setOpen(true);
        System.out.println("Opened");
    }

    public void close() {
        this.setOpen(false);
        System.out.println("Closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
