import java.util.*;
class LL{

}
class link {
    public static ListNode deleteNthFromEnd(ListNode head, int n){
        if(head.next==null){
        return head;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){           //size of the linkedlist
            curr=curr.next;
            size++;
        }
        if(n==size){
             return head.next;
        }
        ListNode prev=size-n;          //nth-1 node from last
        prev.next=prev.next.next;     //linked nth-1 to nth+1 making nth deleted
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public ListNode findMid(ListNode head){
        ListNode hare=head;                     //hare-turtle method - hare pointer jumps 2 and turtle by 1
        ListNode turtle=head;

        while(hare.next!=null&&hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean pallindrome(){
        if(head==null||head.next==null)
        return true;
        //find mid of LL
        Listnode mid=findMid(head);
        //reverse second half
        ListNode secondHalf=reverse(mid.next);
        //check both halves
        ListNode firstHalf=head;
        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }
            else{
                firstHalf=firstHalf.next;
                secondHalf=secondHalf.next;
            }
        }
        return true;
    }

    public boolean findLoop(ListNode head){
        //if hare-turtle meet then there is a loop, always, mathematically
         ListNode hare=head;
         ListNode turtle=head;
         while(hare.next !=null && hare.next.next != null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare==turtle)
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        LinkedList <Integer> list = new LinkedList <Integer>();
        deleteNthFromEnd();
    }
}
