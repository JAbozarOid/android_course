public class MainClassTestInterface implements TestInterface {

    @Override
    public void print(String name) {
        System.out.println(this);
        System.out.println(name);
    }
    
}
