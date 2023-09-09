import java.util.Arrays;
public class MyList<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;

    }

    public void MyList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;

    }


    public void add(T data) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = data;
    }

    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) array[index];
    }
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        T removedData = (T) array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return removedData;
    }
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }

        T previousData = (T) array[index];
        array[index] = data;
        return previousData;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public T[] toArray() {
        return (T[]) Arrays.copyOf(array, size);
    }

    public void clear() {
        Arrays.fill(array, 0, size, null);
        size = 0;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }





    public MyList(Object[] array, int size) {
        this.array = array;
        this.size = size;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public int size() {

        return size;
    }
    public int getCapacity() {
        return array.length;
    }
}

