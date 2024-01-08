import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;
import java.lang.annotation.Documented;

import mypackage.*;

class Student{
    public int age;
}
@Documented
@interface MyAnnotation{
    public String author();
    public String dateCreate() default "2024-01-03";
}
/**
 * InnerProgram
 */
interface Pair<K,V> {
    public K getKey();
    public V getValue();
    default void DefaultMethod(){
        out.println("Default method");
    }
}

class Compare{
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}
enum Names{
    RED (1, "red"),
    WHITE (2, "white");

    Integer key;
    String name;
    private Names(Integer key, String name) {
        this.key = key;
        this.name = name;
    }
}
class MyClass<K,V> implements Pair<K,V>{
    private K key;
    private V value;
    public MyClass(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {return key;}
    public V getValue() {return value;}
    public void DefaultMethod(){
out.println("Default method 2");

    }
}
@MyAnnotation(author = "John", dateCreate = "2023-01-04")
public class Program{
    public static void InOut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = scanner.next();
        name += scanner.nextLine();
        System.out.println("Input your age: ");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println(String.format("%s - %d", name, age));
    }
    public static void Lamda(){
        // lamda, supply parameters, return Bool
        Predicate<String> pre = (s)->{
            return s.length() == 3;
        };
        System.out.println(pre.test("okoko"));
        // no parameters, no return value
        Runnable run = ()->System.out.println("runnable called");
        // have parameters, no return value
        Consumer<String> consumer = s -> System.out.println(String.format("consumer called with: %s", s));
        run.run();
        consumer.accept("van loc");
    }
    @SuppressWarnings({"unchecked", "deprecation"})
    public static void ChangeValue(Student p)
    {
        // only array and string is ref, other is out
        p.age++;
    }
    public static void main(String[] args){
<<<<<<< Updated upstream
<<<<<<< Updated upstream
       out.println("change git ");
       out.println("change git 5");

=======
       out.println("change git 3");       
       out.println("change git 4");
>>>>>>> Stashed changes
=======
       out.println("change git 3");       
       out.println("change git 4");
>>>>>>> Stashed changes
    }
}