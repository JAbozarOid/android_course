import java.util.ArrayList;

// collection means a list of objects or maybe a list of data type
public class CollectionClass {
    public static void main(final String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("abozar");
        names.add("elham");

        System.out.println("the 1 index value is " + names.get(1));

        System.out.println("the size of array list before clear method is :" + names.size());

        names.clear();

        System.out.println("the size of array list after clear method is: " + names.size());

        names.add("abooo");
        names.add("abel");
        names.add("amin");

        for (String string : names) {
            System.out.println("the array values are: " + string);
        }

        System.out.println("I want to remove the value at index 2 which is " + names.get(2));

        names.remove("amin");

        for (String string : names) {
            System.out.println("the array value are: " + string);
        }

        System.out.println("check if the amin value is in array list or not " + names.contains("amin"));

        System.out.println("check if the array list is empty or not " + names.isEmpty());
    }
}
