package interview;

public class LinkedList1 {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public boolean insertData(int data){
        Node n1 = new Node(data);
        n1.next = null;
        if(this.head == null){
            this.head = n1;
        }else{
            Node itr = head;
            while(itr != null){
                if(itr.next == null){
                    itr.next = n1;
                    break;
                }
                itr = itr.next;
            }
        }
        return true;
    }

    public void printData(){
        Node itr = head;
        System.out.print("[");
        while(itr != null){
        	System.out.print(" "+itr.data+" ");
            itr = itr.next;
        }
        System.out.print("]");
    }

}
