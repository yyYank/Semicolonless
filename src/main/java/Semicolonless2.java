/**
 * Created by yy_yank on 2016/11/15.
 */
public class Semicolonless2 {
    public static void main(String[] args) {
        if (java.util.stream.Stream.of(Hello.values()).peek(SemicolonlessGreeter::greet).noneMatch(hage -> hage == null)) {
        }
    }
}


enum Hello implements SemicolonlessGreeter {
    WORLD
}

interface SemicolonlessGreeter {
    default void greet() {
        if (java.util.stream.Stream.of("Hellow Semicolonless!!!!!!").peek(System.out::println).anyMatch(String::isEmpty)) {
        }
    }
}
