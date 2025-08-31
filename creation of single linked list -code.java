//taking input from the user
import java.util.Scanner;

public class Main {

    // Node class
    static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Main method
 
        public static void main(String[] args){

        // Create the first node (head of the list)
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the num of nodes:");
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("list is empty");
            return;
            
        }

        System.out.print("node 1:");
        int data=sc.nextInt();
        Node head=new Node(data);
        Node curr=head;
        
        for(int i=2;i<=n;i++){
            System.out.print("node"+i+":");
           data=sc.nextInt();
            curr.next=new Node(data);
            curr=curr.next;
        }
        /*
option -2
        this will be in a direct insertion way

        Node head = new Node(10);

        // Link the second node
        head.next = new Node(20);

        // Link the third node
        head.next.next = new Node(30);

        // Link the fourth node
        head.next.next.next = new Node(40);
        */



        // Print the linked list
        Node ll=head;
        while(ll!=null){
            System.out.print(ll.data+"->");
            ll=ll.next;
        }
        System.out.println("null");
       
    }
}
