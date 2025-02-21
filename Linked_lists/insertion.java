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

class singly_linked_list {
    node head;
    node tail;

    void add(int value) {
        node new_node = new node(value);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    void printList() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "--");
            current = current.next;
        }
        System.out.println(tail.next);
    }

    // SEARCHING IN SiNGLY LINKED_LISTS
    void searchList(int value) {
        node current = head;

        while (current != null) {
            if (current.data == value) {
                System.out.println("Value found: " + value + " is equal to " + current.data);
                return; 
            }
            System.out.println("Value not found: " + value + " is not equal to " + current.data);
            current = current.next;
        }

        //  value was not found in the list
        System.out.println("Value " + value + " not found in the list.");
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

        list.searchList(36);
    }

}