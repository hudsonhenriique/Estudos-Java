public class Main{
    public static void main(String[] args) {
        System.out.println("**************");

        NameList nameList = new NameList();

        nameList.addName("Alice");
        nameList.addName("Bob");
        nameList.addName("Charlie");
        nameList.addName("David");
        nameList.displayNames();
        System.out.println("*************");
        nameList.removeName("Bob");
        nameList.displayNames();
        System.out.println("*************");
        System.out.println("Fim do programa.");
        System.out.println("*************");
    }
}