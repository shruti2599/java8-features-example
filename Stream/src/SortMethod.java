import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMethod {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");

        //Sort in Ascending order

        List<String> sortedList = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList1);

        //using Lambda Expression

        List<String> sortedList2 = fruits.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList2);

        //Sort in Descending Order

        System.out.println("Descending Order.........");

        List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList3);

        //using Lambda Expression

        List<String> sortedList4 = fruits.stream().sorted((o1,o2)-> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList4);


    }
}
