/**
 * Created by yy_yank on 2016/11/20.
 */
public class Semicolonless5 {
    public static void main(String[] args) throws ClassNotFoundException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        if(java.util.stream.Stream.of(new javax.swing.JFrame("Hello Semicolonless JFrame"))
                .peek(f -> f.setVisible(true))
                .peek(f -> f.setBounds(100, 100, 300, 250)).count() != 0){}
    }
}


