import java.util.function.BiFunction;

//Using traditional way

public class Demo implements BiFunction<Integer,Integer,Integer> {
    @Override
    public Integer apply(Integer a, Integer b) {
        return (a+b);
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = new Demo();
        System.out.println(biFunction.apply(110,120));
        System.out.println(biFunction.apply(18000,12000));
    }
}
