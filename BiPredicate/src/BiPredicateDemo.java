import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {

        //Using Anonymous Functional interface
        BiPredicate biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        System.out.println(biPredicate.test("Shruti","s"));

        //Using Lambda Expression

        BiPredicate biPredicate1 = ( s, s2) ->  s.equals(s2);
        System.out.println(biPredicate.test("Shruti","Shruti"));

        BiPredicate<Integer,Integer> biPredicate2 = ( x, y) ->  x>y;
        BiPredicate<Integer,Integer> biPredicate3 = ( x, y) ->  x==y;

        Boolean result = biPredicate2.and(biPredicate3).test(20,10);
        System.out.println(result);
        Boolean result1 = biPredicate2.or(biPredicate3).test(20,10);
        System.out.println(result1);
    }
}
