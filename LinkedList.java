
class ListNode{
    int val;
    ListNode next;

  ListNode(int val){
    this.val = val;
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
         third.val = 100;
     ListNode head = first;
     ListNode current = head;
        while(current != null ){
            System.out.println(current.val);
            current = current.next;
        }
      System.out.println();
    }
}