public class StaticClass {
    public static void main(String[] args) {
        
        // for accessing static variables in other classes it doesn't need to instantiate that class
        StaticTest.number = 5;

        // if we change the value of the static variable, it will be change in all project

        StaticTest.printName("Abozar");
        
    }
    
}
