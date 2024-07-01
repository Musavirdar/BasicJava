// in this code we implement Singly Linked List in java
class Node{
  int data;
  Node next;
  Node(int data){
      this.data = data;
      this.next = null;
  }
}
class singlyLinkedList{
    Node head;
    int size;
    singlyLinkedList(){
        this.head = null;
        this.size = 0;

    }
    void Append(int data){
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;

        }
        else {
            Node curr = this.head;
            while (curr.next != null ){
                curr = curr.next;


           }
            curr.next = node;
        }
        this.size++;
    }
    boolean remove(int data){
        if(this.head == null) return false;
        if (this.head.data == data) {
            this.head = this.head.next;
            this.size--;
            return true;
        }
        Node curr = this.head;
        Node prev = null;
        while (curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {return false;}
        if (prev != null){

            prev.next = curr.next;
           curr = null;
        }
            this.size--;
            return true;
    }
    void getSize(){
        int Size = this.size;
        System.out.println("Size of the linked List => "+Size);
    }
    void Display(){
    Node current = this.head;
    StringBuilder out = new StringBuilder();
    while (current != null){
        out.append(current.data).append("-->");
        current = current.next;
    }
        out.append("null");
        System.out.println(out.toString());

    }
}
public class singlyLinkedList {
    public static void main(String[] args) {
        singlyLinkedList sl = new singlyLinkedList();
        sl.Append(45);
        sl.Append(22);
        sl.Append(96);
        sl.Append(95);
        sl.Display();
        sl.getSize();
       sl.remove(96);

        sl.getSize();
        sl.Display();
    }
}
