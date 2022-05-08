package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:ListTest01
 * Package:string
 * Description:
 *
 * @Date:2022/5/5 17:00
 * Author:1478108793@qq.com
 */
public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.indexOf(2));
        System.out.println(myList.lastIndexOf(2));
        myList.set(2, "liule");
        for (Object o : myList) {
            System.out.println(o);
        }
    }
}
