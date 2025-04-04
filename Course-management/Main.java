public class Main {
    public static void main(String[] args) {
        try {
            Instructor instructor1 = new Instructor("Hudson Henrique","hudson.henri10@gmail.com","Programação Java");

            Course course1 = new Course("Programação Java", 40, instructor1);

            course1.displayDetails();
            course1.setWorkLoad(60);

            System.out.println("Nova Carga Horária: " + course1.getWorkLoad() + " horas");
            course1.displayDetails();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Programa Finalizado com sucesso!");
        System.out.println("-------------------------------------------------");
    }
}

