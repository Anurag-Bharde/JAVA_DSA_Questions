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
    public static node tail;

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
        while(i<size-2){
            ru=ru.next;
            i++;
        }
        System.out.println(ru.next.data);
          ru.next=null;
          ru=tail;
          size--;
    }

     void removefir(){
        if(size==0){
            System.out.println("Empty");
            return;
        }
        if(size==1){
            System.out.println(head.data);
            head=tail=null;
            return;
        }
        node ne=head;
        head=ne.next;
        ne=null;
        size--;
    }
      void delmid(int n){
          if(size==0){
              System.out.println("Empty");
              return;
          }
          if(size==1){
              System.out.println(head.data);
              head=tail=null;
              return;
          }
          int i=0;
          node tr=head;
          while(i<n-1){
              tr=tr.next;
              i++;
          }
          tr.next=tr.next.next;
          size--;
     }

     void itrsearch(int x){
        node re=head;
        boolean t=false;
        for(int i=0;i<size;i++){
            if(re.data==x){
                System.out.println("Found "+i);
                t=true;
                break;
            }
            re=re.next;
        }
        if(t=false){
            System.out.println("not found");
        }

     }

    public static void main(String[] args) {
        LL link=new LL();
        link.addLast(23);
        link.addLast(24);
        link.addFirst(25);
        link.addLast(50);
        link.print();
//        link.delmid(2);
//        link.remLast();
//        System.out.println(tail.data);
//        link.removefir();
        link.itrsearch(24);
        link.print();
        System.out.println(link.size);
    }




}
