
public class ArrayCollection extends AbstractCollection
{
    private final int LENGTH_I = 16;
    private int size;
    private Object[] data = new Object[LENGTH_I];

    public int size()
    {
        return size;
    }

    public boolean add(Object obj)
    {
        if(size==data.length)
        {
            resize();
        }
        data[size++]=obj;
        return true;
    }

    public void resize()
    {
        Object[] temp = new Object[this.data.length*2];
        System.arraycopy(this.data, 0, temp, 0, this.data.length);
        this.data = temp;
    }

    public Iterator iterator()
    {
        return new Iterator()
        {
            private int i = 0;
            private boolean okToRemove=false;

            public boolean hasNext()
            {
                return (i<size);
            }

            public Object next()
            {
                if(i==size)
                {
                    throw new RuntimeException();
                }
                okToRemove =  true;
                return data[i++];
            }

            public void remove()
            {
                if(!okToRemove) throw new IllegalStateException();
                data[--i]  = data[--size];
                data[size] = null;
                okToRemove = false;
            }
        };
    }
    
}
