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