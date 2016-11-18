/**
 * Created by yy_yank on 2016/11/15.
 */
public class Semicolonless3 {
    public static void main(String[] args) {
        if (java.util.stream.Stream.of(Hello.values()).peek(SemicolonlessGreeter::greet).noneMatch(hage -> hage == null)) {
        }
    }
}


