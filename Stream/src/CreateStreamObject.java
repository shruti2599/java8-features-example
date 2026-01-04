import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {

    public static void main(String[] args) {

        //create stream object using Stream method of()
        Stream<String> stream = Stream.of("a", "b","c");
        stream.forEach(System.out::println);

        //Create stream using sources

        //Collection

        System.out.println("Collection as source to stream");
        Collection<String> collection = Arrays.asList("Shruti", "Rocky", "Leo");
        System.out.println("Printing collection........");
        for(String item : collection){
            System.out.println(item);
        }
        Stream<String> stream2 = collection.stream();
        System.out.println("Printing Stream........");
        stream2.forEach(System.out::println);

        //List

        System.out.println("List as source to stream");
        List<String> list = Arrays.asList("Core Java", "OOps", "Java8");
        System.out.println("Printing List.......");
        for(String item : collection){
            System.out.println(item);
        }
        System.out.println("Printing Stream........");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        //Set

        Set<String> set = new HashSet<>(list);
        System.out.println("Printing Set........");
        for(String item: set){
            System.out.println(item);
        }
        Stream<String> stream4 = set.stream();
        System.out.println("Printing Stream........");
        stream4.forEach(System.out::println);

        //Array

        String[] array = {"Car","Bike","Scooty","Truck"};
        System.out.println("Printing Array........");
        for(String item: array){
            System.out.println(item);
        }

        System.out.println("Printing Stream........");
        Stream<String> stream5 = Arrays.stream(array);
        stream5.forEach(System.out::print);
    }
}
