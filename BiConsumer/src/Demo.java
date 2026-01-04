import java.util.function.BiConsumer;

public class Demo implements BiConsumer<Integer,Integer> {
    @Override
    public void accept(Integer a, Integer b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = new Demo();
        biConsumer.accept(10,20);
    }
}
