//so in linked lists when we want to insert a node 
//we have to check if the head  is null or not(meaning the list is empty or not)
//if its empty we set the node as the head and tail
//if its not empty we set our new node as the new tail and let the previous tail point to the new tail


package Linked_lists;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}


class singly_linked_list{
    node head;
    node tail;

   void add(int value){
         node new_node = new node(value);
         if (head ==null) {
            head = new_node;
            tail = new_node;
         }else{
            tail.next= new_node;
            tail= new_node;
         }
   }

    void printList(){
         node current = head;
         while (current != null) {
              System.out.print(current.data +"--");
              current = current.next;
         }
       System.out.println(head.next);
    }
}

public class insertion {

    public static void main(String[] args) {
        singly_linked_list list = new singly_linked_list();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        list.printList();
    }
    
}