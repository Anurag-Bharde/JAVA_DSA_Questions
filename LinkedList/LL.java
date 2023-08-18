package LinkedList;

public class LL {
    private class node {
        int data;
        node next;
        public node(int data, node next){
            this.data=data;
            this.next=next;
        }
        public node(int data){
            this.data=data;
        }
    }
    public node head;
    public node tail;
    public int size;
    public LL(){
        this.size=0;
    }
    public void add(int value){
        node ner=new node(value);
        ner.next=head;
        head=ner;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void addl(int val){
        if(tail==null){
            add(val);
            return;
        }
        node neww=new node(val);
        tail.next=neww;
        tail=neww;

        size+=1;
    }
    void insert(int ind,int val){
        if(ind==0){
            add(val);
            size++;

            return;
        }
        if(ind==size){
            addl(val);
            size++;
            return;
        }
        node temp=head;
        for(int i=1;i<ind;i++){
            temp=temp.next;
        }
        node nw=new node(val,temp.next);
//        nw.next=temp.next;
        temp.next=nw;
        size++;
    }
   public int del(int idx){
        if(idx==0){
            head=head.next;
        }
        if(idx==size){
            tail=null;

       }
        node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        int t=temp.next.data;
        temp.next=temp.next.next;
        return t;
   }

   public int get(int idx){
        node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        int r=temp.data;
        return r;
   }
    public void dis(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertrec(int data,int index){
       head=insertrec(data,index,head);
    }
    public node insertrec(int data,int index,node head){
        if(index==0){
            node temp=new node(data,head);
            size++;
            return temp;
        }
        head.next=insertrec(data,index-1,head.next);
        return head;
    }

    public void remdupli(){
        node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }
        }
    }

}

