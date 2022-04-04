# 141. 环形链表
## 1. 哈希表
用 哈希表 存每个节点对象，key 为节点对象的哈希值，每次存入前判断 key 是否存在
```
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
```
