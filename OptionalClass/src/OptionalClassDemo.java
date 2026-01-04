import java.util.Optional;

public class OptionalClassDemo {

    public static void main(String[] args) {

        //Static Methods of Optional class-empty,of, ofNullable

        //Creating empty Object using Optional class
        Optional<Object> emptyObject = Optional.empty();
        System.out.println(emptyObject);

        String email = "shruti@gmail.com";
        String name = null;

        //of
        System.out.println("of...");
        Optional<String> optionalString = Optional.of(email);
        System.out.println(optionalString);
//        Optional<String> optionalString1 = Optional.of(name);
//        System.out.println(optionalString1); //throws null pointer exception as name is null

        //get
        System.out.println((optionalString.get()));
//        Optional<String> optionalString1 = Optional.of(name);
//        System.out.println(optionalString1.get()); //throws null pointer exception as name is null

        //ofNullable
        System.out.println("ofNullable");
        Optional<String> optional = Optional.ofNullable(email);
        System.out.println(optional);
        Optional<String> optional1 = Optional.ofNullable(name);
        System.out.println(optional1);
        //orElse
        System.out.println("orElse");
        String optional2 = optional.orElse("default@gmail.com");
        System.out.println(optional2);
        String optional3 = optional1.orElse("default@gmail.com");
        System.out.println(optional3);

        //orElseGet
        System.out.println("orElseGet");
        String optional4 = optional.orElseGet(() -> "default@gmail.com");
        System.out.println(optional4);
        String optional5 = optional1.orElseGet(() -> "default@gmail.com");
        System.out.println(optional5);

        //orElseThrow
        System.out.println("orElseThrow");
        String optional6 = optional.orElseThrow(()-> new IllegalArgumentException("Email not exist."));
        System.out.println(optional6);

//        String optional7 = optional1.orElseThrow(()-> new IllegalArgumentException("Name is not exists"));
//        System.out.println(optional7);

        //ifPresent()
        System.out.println("ifPresent");
        Optional<String> gender = Optional.of("Female");
        Optional<String> emptyObj = Optional.empty();

        gender.ifPresent((s)-> System.out.println("Value is present"));
        emptyObj.ifPresent((s)-> System.out.println("No value"));

        //filter()
        System.out.println("filter().....");
        String str = "abc";
        Optional<String> optional8 = Optional.of(str);
        optional8.filter((res) -> res.contains("abc"))
                .ifPresent((res)-> System.out.println(res));

        //map()
        System.out.println("map().....");
        String str1 = "     XYZ ";
        Optional<String> optional9 = Optional.of(str1);
        optional9.filter((res) -> res.contains("XYZ"))
                .map(String::trim)
                .ifPresent((res)-> System.out.println(res));
    }
}
