package linked.e141;

import linked.ListNode;

import java.util.HashMap;

/**
 * @author lihaocheng
 * @createtime 2022/4/4
 */
public class CycleLinked {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        while (head.next !=null){
            //判断表里有没有这个对象
            if (map.get(head.hashCode())!=null){
                return true;
            }
            map.put(head.hashCode(),1);
            head =head.next;
        }
        return false;
    }
}
