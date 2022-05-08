package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName:CollectionTest01
 * Package:string
 * Description:
 *
 * @Date:2022/5/5 11:09
 * Author:1478108793@qq.com
 */
public class CollectionTest01 {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
//        c.add("abc");
//        c.add(123);
//        c.add(455);
//        c.add(new Object());
//        Object[] objs = c.toArray();
//       for (int i=0;i< objs.length;i++){
//           System.out.println(objs[i]);
//       }
//        Iterator it = c.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        Collection c1 = new HashSet();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(5);
        c1.add(4);
        c1.add(1);
        Iterator it1 = c1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println(c1.size());
        String s1 = new String("abc");
        c1.add(s1);
        String s2 = new String("abc");
        System.out.println(c1.contains(s2));
        System.out.println("hello git");
    }


}
