public abstract class TestAbstractClass {
    abstract void print(String name);
    
    // implement non abstract method in abstract class
    public void printName() {


    }

    private int number;

    // create constructor
    public TestAbstractClass(int number) {
        this.number = number;
    }
}
