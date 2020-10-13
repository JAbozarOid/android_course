public class StaticTest {

    // we defne this variable as public, because we want to access this out of the class
    public static int number = 0;

    private String name;
    private int id;

    // static variables can not be part of constructors
    public StaticTest(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // static method 
    // inside of the static method we can just access to static variable and static methods
    public static void printName(String name) {
        System.out.println(name);
        
        // as you can see in the static method we can not access to a non-static method
        //nonStaticPrintMethod();
    }

    // if we add static to this method it can be referred to a static method, but for now it is unaccessable
    public void nonStaticPrintMethod() {
        System.out.println(name);
    }

    
    
}
