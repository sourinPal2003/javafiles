package DSA;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedList {
    Node head;
    public linkedList(){
        this.head=null;
    }

    public void insert(int data){
        Node newNode= new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }

    public void display(){
        if (head == null) {
            System.out.println("linked list is empty!");
            return;
        }
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }

    public void deleteAtFirst(){
        if (head == null) {
            System.out.println("linked list is empty! can't be delete");
            return;
        }

        head=head.next;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("Linked list is empty! Cannot delete.");
            return;
        }
    
        if (head.next == null) {
            // If there's only one element in the list, set head to null to make it empty.
            head = null;
            return;
        }
    
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    

    public static void main(String[] args) {
        linkedList l1=new linkedList();
        l1.display();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.display();
        l1.deleteAtLast();
        l1.display();
    }
}
