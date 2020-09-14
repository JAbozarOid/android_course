public class ArrayClass {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "abozar";
        names[1] = "elham";
        names[2] = "abel";
        names[3] = "amin";
        names[4] = "hamio";

        System.out.println(names[1]);

        // another way of define array
        int[] a = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < names.length; i++) {
            System.out.println(a[i]);
        }

    }
}
