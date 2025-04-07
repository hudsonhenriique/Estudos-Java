
import java.util.Arrays;

public class ManagedArray {
    private int[] array;
    private int size;

    public ManagedArray(int capacity){
        array = new int[capacity];
        size = 0;
    }

    public void add(int value){
        if(size < array.length){
            array[size++] = value;
        }
    }

    public void remove(int value){
        for(int i = 0; i < size;i++){
            if(array[i] == value){
                array[i] = array[size - 1];
                size--;
                return;
            }
        }
    }

    public void search(int value){
        for(int i = 0; i < size; i++){
            if(array[i] == value){
                System.out.println("Achei: " + value);
                return;
            }
        }
        System.out.println("Não achei: " + value);
    }

    public void print(){
        System.out.println(Arrays.toString(Arrays.copyOf(array, size)));
    }
}
