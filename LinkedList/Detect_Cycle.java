package LinkedList;

public class Detect_Cycle {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode i=head;
        ListNode j=head;
        int sz=0;
        while(j!=null || i.val!=j.val){
            i=i.next;
            j=j.next.next;
        }
        if(j!=null){
            i=head;
            while(i.val!=j.val){
                i=i.next;
                j=j.next;
                sz++;
            }
        }
        else return null;

        return i;
    }

    public static void main(String[] args) {

    }
}
