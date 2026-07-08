class ListNode{
    int var;
    ListNode next;

    ListNode(int data){
        this.var = data;
        this.next = null;
    }
}
public class LinkedList{
    public static void main(String[] args){
        
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        first.next = second;
        second.next = third;

        System.out.println(first.var);
System.out.println(second.var);
System.out.println(third.var);
    }
}