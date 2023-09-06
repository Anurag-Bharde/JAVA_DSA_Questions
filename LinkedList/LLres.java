package LinkedList;


public class LLres {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
        node(int data, node r){
            this.data=data;
            this.next=next;
        }
    }
    public static node head;
    public static int size;
    LLres(){
        this.size=0;
    }
    void addLast(int data){
        if(size==0){
            addfirst(data);
            return;
        }
        node nem=new node(data);
        node t=head;
        while(t.next!=null){
            t=t.next;
        }
        size++;
        t.next=nem;
    }
    void addfirst(int data){
        if(size==0){
            node ne=new node(data);
            head=ne;
            size++;
            return;
        }
        node nem=new node(data);
        node t=head;
        nem.next=t;
        size++;
        head=t;
    }
    void print(){
        node r=head;
        while(r!=null){
            System.out.print(r.data);
            System.out.print("->");
            r=r.next;
        }
        System.out.println("END");
    }
}
