public class Repetition {
    public static void main(String[] args){
        // Repetition structures
        // while loop
        int i = 0;
        while (i <= 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }

        System.out.println("**End of while loop**");

        // do-while loop
        int j = 0;
        do {
            System.out.println("Do-while loop iteration: " + j);
            j++;
        } while (j <= 5);

        System.out.println("**End of do-while loop**");

        // for loop
        for (int k = 0; k <= 5; k++) {
            System.out.println("For loop iteration: " + k);
        }

        System.out.println("**End of for loop**");

        System.out.println("***End of repetition structures***");
    }
}
