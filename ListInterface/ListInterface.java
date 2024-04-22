package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        System.out.println("Original list: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2!= 0) { 
                String removedStr = list.remove(i);
                System.out.println("Removed element: " + removedStr);
            }
        }

        System.out.println("List after removing every second element: " + list);
    }
}
