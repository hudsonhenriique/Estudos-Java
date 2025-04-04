import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Digite o dia da semana (por exemplo: Segunda, Terça...):");
            String day = scanner.nextLine();

            switch (day.toLowerCase()) {
                case "segunda":
                    System.out.println("Hoje é segunda-feira, hora de começar a semana!");
                    break;
                case "terça":
                case "terca":
                    System.out.println("Hoje é terça-feira, ainda no começo da semana.");
                    break;
                case "quarta":
                    System.out.println("Hoje é quarta-feira, metade da semana!");
                    break;
                case "quinta":
                    System.out.println("Hoje é quinta-feira, quase lá.");
                    break;
                case "sexta":
                    System.out.println("Hoje é sexta-feira, fim da semana!");
                    break;
                case "sábado":
                case "sabado":
                    System.out.println("Hoje é sábado, aproveite o final de semana.");
                    break;
                case "domingo":
                    System.out.println("Hoje é domingo, dia de adorar ao Senhor e recarregar as energias.");
                    break;
                default:
                    System.out.println("Dia inválido! Certifique-se de escrever corretamente.");
            }

            System.out.println("Deseja continuar? (S/N)");
            String continueChoice = scanner.nextLine();

            if (!continueChoice.equalsIgnoreCase("S")) {
                continueProgram = false;
            }
        }

        scanner.close();
    }
}
