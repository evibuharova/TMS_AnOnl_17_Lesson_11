import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyCollectionArrays <Integer> collection = new MyCollectionArrays <Integer>();
        collection.add (5);
        collection.add (6);
        collection.add (7);
        collection.add (8);
        collection.add (9);
        collection.add (10);
        collection.remove (1);
        System.out.println(collection.getElement(0));
        System.out.println(collection);
        System.out.println(collection.containsElements(15));
        collection.clear();
        collection.add (3);
        collection.add (3);
        collection.add (3);
        System.out.println(collection);

    }
}
