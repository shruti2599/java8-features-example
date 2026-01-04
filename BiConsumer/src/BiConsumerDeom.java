import java.util.function.BiConsumer;

//Using Anonymous Functional Interface
public class BiConsumerDeom {
    public static void main(String[] args) {

        //Using Anonymous Functional Interface
        BiConsumer<Integer,Integer> biConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer a, Integer b) {
                System.out.println(a+b);
            }
        };
        biConsumer.accept(10,20);

        //Using Lambda Expression
        BiConsumer<Integer,Integer> biConsumer1 = ( a,  b)->System.out.println(a+b);
        biConsumer1.accept(50,20);
        BiConsumer<Integer,Integer> biConsumer2 = ( a,  b)->System.out.println(a/b);
        biConsumer2.accept(40,20);
    }
}
