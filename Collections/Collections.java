import Queue.Node;

//import java.util.Iterator
interface Iterator{
    public boolean hasNext();
    public Object next();
    public void remove();
}
public interface Collections{
    public boolean add(Object obj);
    public void clear(Object obj);
    public boolean contains(Object obj);
    public boolean isEmpty();
    public Iterator iterator();
    public boolean remove(Object obj);
    public int size();
}
public abstract class AbstractColllection implements Collections {
    protected AbstractColllection(){}
    public abstract int size();
    public abstract iterator iterator();
    public boolean add(object obj){
        throw new UnsupportedOpertionExceptin();}
        public boolean isEmpty(){
            return (size()==0);
        }
        public String toString(){
            if(isEmpty()) return "[ ]"; 
            Iterator it=iterator();
            StringBuffer buf = new StringBuffer("["+it.next());
            while (it.hasNext()) 
            { buf.append(","+it.next());
            return (buf+"]");
            }
        }
        public void clear() {
            for (Iterator it=iterator(); it.hasNext();) {
                it.next();
                it.remove();
            }
        }
        public boolean  remove(Object obj) {
            Iterator it = Iterator();
            if (obj==null)
            while (it.hasNext()) {
                if (it.next()==null) {
                    it.remove();
                    return true;
                }
                else{
                    while (it.hasNext()) {
                        if (obj.equals(it.next())) {
                            it.remove();
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        public static void merge(Node head1, Node head2){
            head1.prev.next=head2.next;
            head2.next.prev=head1.prev;
            head2.prev.next=head1;
            head1.prev=head2.prev;
        }
    }
