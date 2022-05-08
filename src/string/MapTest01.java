package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:MapTest01
 * Package:string
 * Description:
 *
 * @Date:2022/5/6 11:03
 * Author:1478108793@qq.com
 */
public class MapTest01 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        String s = map.get(2);
        System.out.println(s);
        System.out.println("Map的键值对的数量是："+map.size());
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("lisi"));
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+"="+value);
        }
        for (Map.Entry<Integer, String> node : set) {
            System.out.println(node.getKey()+"="+node.getValue());
        }
    }
}
