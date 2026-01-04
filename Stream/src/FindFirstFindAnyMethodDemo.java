import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyMethodDemo {
    public static void main(String[] args) {

        List<Integer> arraylist = Arrays.asList(1,2,3,4,5);
        Optional<Integer> first = arraylist.stream().findFirst();
        if(first.isPresent()){
            System.out.println(first.get());
        }else{
            System.out.println("Stream is empty");
        }

        Optional<Integer> any = arraylist.stream().findAny();
        if(any.isPresent()){
            System.out.println(any.get());
        }else{
            System.out.println("Stream is empty");
        }


    }
}
