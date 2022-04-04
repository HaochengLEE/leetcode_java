# 141. 环形链表
给你一个链表的头节点 head ，判断链表中是否有环。 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。 
如果链表中存在环 ，则返回 true 。 否则，返回 false 。


输入：head = [3,2,0,-4], pos = 1
输出：true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/linked-list-cycle

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

## 2.快慢指针
定义两个指针，fast、slow，每次循环 fast 走两步，slow 走一步，如果是环形链表就会出现 fast==slow 的情况。

