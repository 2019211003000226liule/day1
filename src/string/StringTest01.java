package string;

/**
 * ClassName:StringTest01
 * Package:string
 * Description:
 *
 * @Date:2022/4/30 19:24
 * Author:1478108793@qq.com
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);
        String x = new String("XYZ");
        String y = new String("XYZ");
        System.out.println(x==y);
        System.out.println(x.equals(y));
        byte[] bytes = {1,2,3};
        String a = new String(bytes,1,2);
        System.out.println(a);
        char[] chars = {'你','是','我','的','儿'};
        String b = new String(chars);
        System.out.println(b);
        String c = new String(chars,2,3);
        System.out.println(c);
    }
}
