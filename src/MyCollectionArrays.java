import java.util.Arrays;

public class MyCollectionArrays<T> {
    int size = 10;
    Object[] myArray = new Object[size];
    int countValueOfArray;
    //countValueOfArray-количество чисел в массиве
public MyCollectionArrays () {
this(10);
}
    public MyCollectionArrays (int size) {
        this.size=size;
        myArray = new Object[size];
        countValueOfArray=0;
    }
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }

    //value-значение
    public void add(T value) {
        myArray[countValueOfArray] = value;
        countValueOfArray++;
        if (countValueOfArray >= size) {
            size = size * 2;
            myArray = Arrays.copyOf(myArray, size);
        }
    }

    public void remove(int index) {
        for (int i = index; i <= countValueOfArray; i++) {
            myArray[i] = myArray[i + 1];
        }
        countValueOfArray--;
    }

    public T getElement(int index) {
        return (T) myArray[index];
    }

    public boolean containsElements(T element) {
        for (int i = 0; i <= countValueOfArray; i++) {
            if (myArray[i] == element) {
                return true;
            }
        }
        return false;
    }
    public void clear () {
        int size = 10;
        myArray = new Object[size];
        countValueOfArray=0;
    }
}

