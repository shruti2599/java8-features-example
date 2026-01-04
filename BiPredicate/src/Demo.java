import java.util.function.BiPredicate;

public class Demo implements BiPredicate<String, String> {

    //Using Traditional Way
    @Override
    public boolean test(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = new Demo();
        System.out.println(biPredicate.test("Shruti","Shruti"));
        System.out.println(biPredicate.test("xyz","XYZ"));
    }
}
