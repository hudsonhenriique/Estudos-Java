public class Dog extends Animal implements Trainable {
   
    @Override
    public void talk() {
        System.out.println("Woof!");
    }

    @Override
    public void runCommand(String command) {
        System.out.println("Dog be silent. " + command);
    }


} 
    

