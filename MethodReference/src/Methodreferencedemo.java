import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable{
    void print(String msg);
}

public class Methodreferencedemo {

    public static int addition(int a, int b)
    {
        return (a+b);
    }

    public void Display(String msg){
        msg = msg.toUpperCase();
        System.out.println("Printing input into Upper Case : "+msg);
    }

    public static void main(String[] args) {

        //Lambda Expression

        Function<Integer, Double> functionLambda = (input) -> (Math.sqrt(input));
        System.out.println("Square root of number using lambda expression : "+functionLambda.apply(4));

        //Method Reference

        Function<Integer, Double> functionMethod = Math::sqrt;
        System.out.println("Square root of number using Method reference : "+functionMethod.apply(4));

        //2.Method Reference to Static Method

        //Lambda Expression to Static Method

        BiFunction <Integer, Integer,Integer> biFunctionLambda = (a,b)-> Methodreferencedemo.addition(a,b);
        System.out.println("Addition of numbers using lambda expression : "+ biFunctionLambda.apply(10,20));

        //Method Reference to Static Method
        BiFunction<Integer,Integer,Integer> biFunctionMethod = Methodreferencedemo::addition;
        System.out.println("Addition of numbers using lambda expression : "+ biFunctionMethod.apply(10,20));

        //3.Method Reference to Instance Method of an Object

        //Lambda Expression
        Methodreferencedemo object = new Methodreferencedemo();
        Printable printLambda = (msg) -> object.Display(msg);
        printLambda.print("hello shruti!...");

        //Method Reference to Instance Method of an Object
        Printable printMethod = object ::Display;
        printMethod.print("Good Morning...");

        //4.Method Reference to Instance Method of an Arbitrary Object
        //Sometimes we call a method of argument in a lambda expression
        //

        //Lambda Expression
        Function<String, String> stringFunctionLambda = (input) -> input.toLowerCase();
        System.out.println(stringFunctionLambda.apply("MY HOme"));

        //Method Reference to Instance Method of an Arbitrary Object
        Function<String, String> stringFunctionMethod = String::toLowerCase;
        System.out.println(stringFunctionMethod.apply("ROckY"));

        //5.Method Reference to a Constructor

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("List of fruits = "+fruits);

        //Convert list into set using lambda expression
        Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
        System.out.println("Set of Arrays using lambda expression= "+setFunction.apply(fruits));

        //Method Reference

        Function<List<String>, Set<String>> setFunctionMethod = HashSet::new;
        System.out.println("Set of Arrays using lambda expression= "+setFunctionMethod.apply(fruits));

    }
}
