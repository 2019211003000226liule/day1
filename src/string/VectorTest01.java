package string;

import java.util.*;

/**
 * ClassName:VectorTest01
 * Package:string
 * Description:
 *
 * @Date:2022/5/6 9:58
 * Author:1478108793@qq.com
 */
public class VectorTest01 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        Iterator it = v.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        List myList = new ArrayList();//非线程安全的
        Collections.synchronizedList(myList);//变成线程安全的
        int[] arr = {1,2,3,4,5,6};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
