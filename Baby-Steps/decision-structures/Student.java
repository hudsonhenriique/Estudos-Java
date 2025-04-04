class Student{
    private String name;
    private int studentId;
    private double score;

    public Student(String name, int studentId, double score) {
        this.name = name;
        this.studentId = studentId;
        setScore(score);
    }
    public void setScore(double score){
        try {
            if (score < 0 || score > 10) {
                throw new IllegalArgumentException("Nota inválida. A nota deve estar entre 0 e 10.");
            }
            this.score = score;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operação finalizada.");
        }
    }

    public void showInfo() {
        System.out.println("Nome: " + name +", Matrícula: " + studentId + ", Nota: " + score);
        
    }

    public static void main(String[] args) {
        Student student1 = new Student("João", 12345, 8.5);
        student1.showInfo();
        
        Student student2 = new Student("Maria", 67890, 11); // Nota inválida
        student2.showInfo();
        
        Student student3 = new Student("Ana", 54321, -1); // Nota inválida
        student3.showInfo();
    }
}
