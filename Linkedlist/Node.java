
public class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
    }
    
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(){}

       public static void AcessNode(Node n){
            for(Node i=n;i!=null;i=i.next){
                System.out.println(i.data);
            }  
        }
        public static boolean SearchInNode(Node n,int target){
            Node i=n;
            while(i!=null){
                if(i.data==target){
                   return true;
                   // System.out.println("true");
                };
               
            }
            //System.out.println("false");
            return false;

        }

        public static int SumOfAll(Node n){
           int sum=0;
            for(Node i=n;i!=null;i=i.next){
                sum+=i.data;
            }
            return sum;
        }

        public static int LengthOfNode(Node n){
            //Node p=n;
            int length=0;
            for (Node p = n; p !=null; p=p.next) {
                length++;
            }
            return length;
        }
        public static Node delete(Node start, int x){
            if(start==null||start.data>x){
                return start;
            }
            if(start.data==x){
                return start.next;
            }
            for (Node i = start.next; i.next!=null; i=i.next) {
                if(i.next.data>x){
                    break;             
                }
                if(i.next.data==x){
                    i.next=i.next.next;
                    
                }
            }
            return start;
        }
        public static Node clone(Node start) {
           
           
           Node copy=new Node(start.data);
          Node clone=copy;
           for (Node i = start.next; i !=null; i=i.next) {
               copy.next=new Node(i.data);
               copy=copy.next;
           }
            
            return clone;
        }
        public static Node merge(Node start1,Node start2) {
            Node i;
            for (i = start1; i.next!=null; i=i.next) {
                
            }

            i.next=start2;
            return start1;
        }
        public static Node deletelast(Node n) {
            Node i;
            for ( i = n; i.next.next!=null; i=i.next) {
                
            }
            i.next=null;
            return n;
        }
        public static int findHigest(Node n) {
            Node i;
            int max=0;
            for (i = n; i!=null; i=i.next) {
                if(i.data>max){
                    max=i.data;
                }
            }
            return max;
        }
        
        public static int findlowest(Node n) {
            Node i;
            int min=n.data;
            for (i = n; i!=null; i=i.next) {
                if(i.data<min){
                    min=i.data;
                }
            }
            return min;
        }
        public static Node replace(Node n, int pos,int ele) {
            int count=2;
            Node i=n;
           while (i.next!=null) {
                if (count==pos) {
                    break;
                }
                count++;
                  i=i.next;  
                 }
                 
                  i.next=new Node(ele,i.next.next);
                  return n;
        }
        public static Node insert(Node start,int x) {
            Node p=start;
            while (p.next!=null) {
                if(start==null|| start.data>x){
                    break;
                }
                p=p.next;
            }
            p.next=new Node(x,p.next);
            return start;
            
        }
        public static Node Copy(Node start) {
            Node q=new Node(start.data);
            Node temp=q;
            for (Node p = start.next; p!=null; p=p.next) {
                temp = temp.next=new Node(p.data);
            }
            return q;
        }
        public static void main(String[] args) {
            Node start=new Node(30);
            Node n=start; 
            n.next=new Node(60);
            n=n.next;                       //Node Start=new Node(1);
            n.next=new Node(90);             //Start.next=new Node(2);
            n=n.next;                          //Start.next.next=new Node(3);
            n.next=new Node(120);              
           
           
            Node start2=new Node(150);
            Node p=start2; 
            p.next=new Node(180);
            p=p.next;                       //Node Start=new Node(1);
            p.next=new Node(210);             //Start.next=new Node(2);
            p=p.next;                          //Start.next.next=new Node(3);

            // delete(start, 90);
            // AcessNode(start);
            
            Node co=clone(start);
            AcessNode(co);
            }        
}

