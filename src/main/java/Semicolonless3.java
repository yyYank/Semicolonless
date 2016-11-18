
/**
 * Created by yy_yank on 2016/11/15.
 */
public class Semicolonless3 {
    public static void main(String[] args) throws ClassNotFoundException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        if (ClassLoader.getSystemClassLoader().loadClass(HelloSemicolonless.class.getName()).getMethod("main", String[].class).invoke(null, (Object)null) != null) {
        }
    }
}


