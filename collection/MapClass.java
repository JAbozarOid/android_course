import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        // key and value
        map.put("user1", "abozar");

        // get access that object
        System.out.println("get access the value of key user1 is " + map.get("user1"));
        
    }
}
