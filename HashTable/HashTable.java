//make the main method 

public class HashTable {
    private Entry entries=new Entry[11];
    private int size;
    private  class Entry{
        Object Key,value;
        Entry(Object k,Object v){
            Key=k;
            value=v;
        }
        private int hash(Object key){
            //return (Key.hashCode()&&07FFFFFF)
        }

     }
      public int size(){
            return size;
        }
        public void put(Object key,Object value){
            entries[hash(key)]=new Entry(key,value);
            ++size;
        }
    } 
public Object get (Object key){
    return Entries[hash(key)].value;
} 
public Object remove(Object key){
    int h=hash(key);
    Object value=entries[h].value;
    entries[h]=null;
    --size;
    return value;
}
}
