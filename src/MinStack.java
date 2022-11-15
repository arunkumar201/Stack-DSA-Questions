public class MinStack {
    private Node head;

    public void push(int data){
        if(head == null){
             head= new Node(data,data,null);
        }
        else{
            head=new Node((data,Math.min(data,head.min),head);
        }
    }
    public void pop() {
        if (head == null)
            return;
        head = head.next;
    }
    public int top() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }
    public   int getMin(){
        return head.min;
    }

private class Node{
     int data;
     int min;
     Node next;

     public Node(int data,int min,Node next) {
         this.data = data;
         this.min = min;
         this.next = next;
     }
}
}
