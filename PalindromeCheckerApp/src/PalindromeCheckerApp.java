import java.util.*;

class Node {
    char data;
    Node next;
    Node(char d){ data=d; next=null; }
}

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Node head=null, tail=null;
        for(char c:str.toCharArray()){
            Node n=new Node(c);
            if(head==null){ head=tail=n; } else { tail.next=n; tail=n; }
        }
        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(Node head){
        if(head==null||head.next==null) return true;
        Node slow=head, fast=head, prev=null;
        while(fast!=null && fast.next!=null){ fast=fast.next.next; prev=slow; slow=slow.next; }
        prev.next=null;
        Node second=reverse(slow);
        Node first=head;
        while(first!=null && second!=null){
            if(first.data!=second.data) return false;
            first=first.next; second=second.next;
        }
        return true;
    }

    static Node reverse(Node head){
        Node prev=null, curr=head;
        while(curr!=null){
            Node nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}