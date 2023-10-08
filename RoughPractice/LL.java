package RoughPractice;

public class LL {
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}

    public int size;

    public node head;
    public node tail;

    void addFirst(int data){
        node r=new node(data);
        if(head==null){
            head=r;
            size++;
            return;
        }
            r.next=head;
            head=r;
            size++;
    }
    void addLast(int data){
        node r=new node(data);
        if(size==0){
            head=tail=r;
            size++;
            return;
        }
        tail.next=r;
        tail=r;
        size++;
    }

    void print(){
        node hel=head;
        int i=0;
        while(hel!=null){
            System.out.print(hel.data+"->");
            hel=hel.next;
        }
        System.out.println("End");
    }
    void remLast(){
        if(size==0){
            System.out.println("Empty");
            return;
        }
        if(size==1){
            System.out.println(tail);
            head=tail=null;
            System.out.println("Empty");
            return;
        }
        node ru=head;
        int i=0;
        while(i<size-1){
            ru=ru.next;
            i++;
        }
        System.out.println(ru.next.data);
          ru.next=null;
          ru=tail;
    }

    public static void main(String[] args) {
        LL link=new LL();
        link.addLast(23);
        link.addLast(24);
        link.addFirst(25);
        link.addLast(50);
        link.print();
        link.remLast();
        link.print();
        System.out.println(link.size);
    }




}
