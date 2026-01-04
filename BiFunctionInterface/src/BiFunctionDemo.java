import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

    public static void main(String[] args) {

        //Using Ananymous functional interface
        BiFunction<Integer,Integer,Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return (a+b);
            }
        };
        System.out.println(biFunction.apply(12,18));

        //Using lambda expression
        BiFunction<Integer,Integer,Integer> biFunction1 = ( a, b) -> (a+b);
        System.out.println(biFunction1.apply(40,60));
        BiFunction<Integer,Integer,Integer> substraction = ( a, b) -> (a-b);
        System.out.println(substraction.apply(100,60));

        Function<Integer,Integer> function = (number) -> number*number;
        Integer integer = biFunction1.andThen(function).apply(10,20);
        System.out.println(integer);
    }
}
