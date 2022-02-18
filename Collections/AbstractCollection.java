
public abstract class AbstractCollection implements Collection
{
    protected AbstractCollection() {}
    public abstract int size();
    public abstract Iterator iterator();
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public String toString() {
        if(isEmpty()) {
            return "[]";
        }
        Iterator it = iterator();
        StringBuffer buff = new StringBuffer("[" + it.next());
        while(it.hasNext()) {
            buff.append("," + it.next());
        }
        return (buff + "]");
    }
    public void clear() {
        for(Iterator it = iterator(); it.hasNext();) {
            it.next();
            it.remove();
        }
    }
    public boolean remove(Object obj) {
        Iterator it = iterator();
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }
}
