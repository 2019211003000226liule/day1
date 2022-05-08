package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName:CollectionTest02
 * Package:string
 * Description:
 *
 * @Date:2022/5/5 16:41
 * Author:1478108793@qq.com
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator it = c.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
            it.remove();
        }
        System.out.println(c.size());
    }
}
