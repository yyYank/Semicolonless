/**
 * Created by yy_yank on 2016/11/15.
 * なぎせさんのを参考に
 * http://d.hatena.ne.jp/Nagise/20100321/1269182606
 */
public class Semicolonless4 {
    public static void main(String[] args) throws ClassNotFoundException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (java.util.Map<String ,String> map : new java.util.HashMap[]{
                new java.util.HashMap<String ,String>() {
                    @Override
                    public void putAll(java.util.Map<? extends String, ? extends String>  m) {
                        if(put("1", "Hello,") != null){}
                        if(put("2", "Semicolonless") != null){}
                    }
                }
        }) {
            if(map.getClass().getMethod("putAll", java.util.Map.class).invoke(map, map) != null){}
            if(map.entrySet().stream().map(java.util.Map.Entry::getValue).peek(System.out::print).count() != 0){}
        }
    }
}


