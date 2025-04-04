class Student{

    private String name;
    private int registration;
    private double score;

    public Student(String name, int registration, double score) {
        this.name = name;
        this.registration = registration;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score >= 0 && score <=10){
            this.score = score;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public void showDetails(){
        System.out.println("Nome: " + name + ", Matricula: " + registration + ", Nota: " + score);
    }
}