public class HashTable2 {
    private Entry[] entries;
    private int size;

    public HashTable2(int capacity){
        entries = new Entry[capacity];
    }
    private class Entry {
        Object key,value;
        Entry next;
        Entry(Object k ,Object v,Entry n){
            key=k;
            value=v;
            next=n;
        }
    }
    
    public String toString(){
        return key+"= "+(county)value;
    }
    public Object get(Object key){
        int h=hash(key);
        for (Entry e = entires[h]; e !=null; e=e.next) {
            if (e.key.equals(key)) {
                return e.value;
            }
            return null;
        }
        public Object put(Object k ,Object v){
            int h=hash(key);
            for (Entry e = entries[h]; e !=null; e=e.next  ) {
                if (e.key.equals(key)) {
                    Object oldvalue=e.value;
                    e.value=v;
                    return oldvalue;
                }
            }
            entries[h]=new Entry(k, v, entries[n]));
            ++size;
            return null;
        }
    }
    }
}
