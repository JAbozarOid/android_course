import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        
        System.out.println("please enter a number: ");
        
        // using Scanner class
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        System.out.format("the inputed number by user is %d", a);
    }

}
