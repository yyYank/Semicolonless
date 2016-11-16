/**
 * Created by yy_yank on 2016/11/15.
 */
public class Semicolonless2 implements SemicolonlessGreeter {
    public static void main(String[] args) {
        if (java.util.stream.Stream.of(Hello.values()).peek(SemicolonlessGreeter::greet).noneMatch(hage -> hage == null)) {
        }
    }
}


enum Hello implements SemicolonlessGreeter {
    world
}

interface SemicolonlessGreeter {
    default void greet() {
        if (java.util.stream.Stream.of("Hellow Semicolonless!!!!!!").peek(System.out::println).anyMatch(String::isEmpty)) {
        }
    }
}
