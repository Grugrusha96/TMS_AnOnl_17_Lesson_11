import java.util.Arrays;
import java.util.Objects;


public class CustomArrayList<T> {
    private static final int DEFAULT_CAPACITI = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList(){
        elements = new Object[DEFAULT_CAPACITI];
    }

    public CustomArrayList (int initialCapaciti){
        if (initialCapaciti < 0){
            throw new IllegalArgumentException(" Массив не может быть отрицацельным");
        }
        elements = new Object[initialCapaciti];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void add(T index){
        ensureCapacity();
        elements[size ++] = elements;
    }
    public T get (int index){
        checkIndex(index);
        return (T) elements[index];
    }

    public boolean contains(T element){
        return indexOf(element) >= 0;
    }
    public int indexOf (T element){
        for (int i = 0; i < size; i++){
            if (Objects.equals(element, elements[i])){
               return i;
            }
        }
        return -1;
    }
    public void remove(int index){
        checkIndex(index);
        int numMoved = size - index -1;
        if (numMoved > 0){
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }
    public  void  clear(){
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size =0;
    }
    private void ensureCapacity(){
        if (size == elements.length){
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    private void checkIndex (int index){
        if (index < 0 || index >= size){
            throw  new IndexOutOfBoundsException(" Вышел за пределы :" + index);
        }
    }
}
