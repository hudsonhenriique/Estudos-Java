public class Main{
    public static void main(String[] args) {
        System.out.println("Tipos de Arrays");

        ManagedArray managedArray = new ManagedArray(10);

        managedArray.add(10);
        managedArray.add(20);
        managedArray.add(30);
        managedArray.print();
        managedArray.search(20);
        managedArray.remove(10);
        managedArray.print();
        
    }
}