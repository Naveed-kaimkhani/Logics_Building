
public abstract class ArrayCollection extends AbstractCollection
{
    private final int LENGTH_I = 16;
    private int size;
    private Object[] array = new Object[LENGTH_I];
    public int size() {
        return size;
    }
    public boolean add(Object obj)
    {
        if(size == array.length)
        {
            // resize();
            array[size++] = obj;

        }
        return true;
    }
    public Iterator iterator() {
        return new Iterator() {
            private int i = 0;
            private boolean okToRemove;
            @Override
            public boolean hasNext() { return (i < size); }

            @Override
            public Object next() {
                if(i == size) {
                    throw new RuntimeException();
                }
                okToRemove = true;
                return array[i++];
            }

            @Override
            public void remove() {
                if(!okToRemove) {
                    throw new IllegalStateException();
                }
                array[--i] = array[--size];
                array[size] = null;
                okToRemove = false;
            }
        };
    }
}

