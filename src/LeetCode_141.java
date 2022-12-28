//import org.w3c.dom.Node;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class LeetCode_141 {
//
//    public static Node addPolynomial(Node p1, Node p2) {
//        if (p1 == null || p2 == null) {
//            return null;
//        }
//        Node dummy=new Node(-1);
//        Node temp=dummy;
//        Node l1=p1;
//        Node l2=p2;
//        while (l1!= null && l2!= null) {
//
//            if (l1.pow > l2.pow) {
//                temp.next = l1;
//                temp = l1;
//                l1 = l1.next;
//            } else if (l2.pow > l1.pow) {
//                temp.next = l2;
//                temp = l2;
//                l2 = l2.next;
//            } else {
//                l1.coeff += l2.coeff;
//                temp.next = l1;
//                l1 = l1.next;
//                l2 = l2.next;
//            }
//
//        }
//         return p1;
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    public boolean hasCycle_1(ListNode head) {
////        if (head == null) {
////            return false;
////        }
////        ArrayList<ListNode> li=new ArrayList<ListNode>();
////        HashSet<ListNode> hs=new HashSet<ListNode>();
////        ListNode temp=head;
////        while (temp!=null) {
////
////            if(hs.contains(temp)){
////                return hs.get():
////                return true;
////            }else {
////                li.add(temp);
////            }
////            temp=temp.next;
////        }
////        return false;
////    }
////
////
////    public boolean hasCycle(ListNode head){
////        if(head==null){
////            return false;
////        }
////        ListNode slow=head;
////        ListNode fast=head;
////        while(fast.next!=null && fast!=null){
////            slow=slow.next;
////            fast=fast.next.next;
////            if(slow==fast) {
////               return true;
////            }
////        }
////        return false;
////    }
//
//    public static void main(String[] args) {
//
//    }
//}
