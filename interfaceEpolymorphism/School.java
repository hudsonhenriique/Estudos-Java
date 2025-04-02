public class School {
    public static void main(String[] args) {
        Student student1 = new Student("João", 12345, 8.5);
        Student student2 = new Student("Maria", 67890, 9.0);

        student1.setScore(15);
        
        student1.showDetails();
        student2.showDetails();

        System.out.println("*******************************");

        Assessment studentGrad = new UndergraduateStudent("Pedro",11234, 7.5);

        Assessment studentPos = new PostgraduateStudent("Ana", 56789, 8.0);

        System.out.println("Média de Pedro (Graduação)... " + studentGrad.average());
        System.out.println("Média de Ana (Pós-Graduação)... " + studentPos.average());
    }
}
