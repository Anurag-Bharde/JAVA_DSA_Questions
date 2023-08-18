package LinkedList;

public class DLL {
    public class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data=data;
        }
        public node(int data,node next,node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
    public node head;
    public node tail;
    int size;
    public DLL(){
        this.size=0;
    }
    public void insert(int data){
        node noe=new node(data);
        noe.next=head;
        noe.prev=null;
        if(head!=null){
            head.prev=noe;
        }
        head=noe;
        size++;
    }
    public void disp(){
        node temp=head;
        node last=null;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            last=temp;
          temp=temp.next;
        }
        System.out.println("END");

        while(last!=null){
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }
    public void ins_las(int data){
        node ee=head;
        while(ee.next!=null){
            ee=ee.next;
        }
        node nee=new node(data);
//        ee=nee;
        nee.prev=ee;
        ee.next=nee;
        tail=nee;
        size++;
    }
    public void insertt(int data,int idx){
        node tt=head;
        int i=1;
        while(i<idx){
            tt=tt.next;
            i++;
        }
        node nee=new node(data);
        nee.prev=tt;
        if(tt.next!=null){
            nee.next=tt.next;
            tt.next.prev=nee;
        }
        tt.next=nee;
        size++;
    }
}
