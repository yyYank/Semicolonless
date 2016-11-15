/**
 * Created by yy_yank on 2016/11/15.
 */
public class HelloSemicolonless {


    public static void main(String[] args) {
        if(java.util.stream.Stream.of("Hellow Semicolonless!!!!!!").peek(System.out::println).anyMatch(String::isEmpty)){}
    }
}
