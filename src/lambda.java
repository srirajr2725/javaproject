
//interface Sec{
//
//    void pw();
//
//
//}


import java.util.function.*;

public class lambda {
    public static void main(String[] args) {

//        Sec sec=()-> System.out.println("pw");
//
//        sec.pw();

        Consumer<String> consumer=(str)-> System.out.println(str+" consumer access");
        consumer.accept("kumar");

        Supplier<String> supplier=()-> "bought";

        System.out.println(supplier.get());

        Function<String,Integer> function=(str)-> str.length();

        System.out.println(function.apply("hiiii"));

        BiFunction<String,String,Boolean>biFunction=(n1,n2)->n1.equals(n2);
        System.out.println(biFunction.apply("hi","hi"));

        Predicate<String> predicate=(str)-> str.startsWith("h");

                System.out.println(predicate.test("heloo"));

    }


}
