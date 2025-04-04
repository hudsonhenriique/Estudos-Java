public class Course {
    private String courseName;
    private int workload;
    private Instructor instructor;

    public Course(String courseName, int workload, Instructor instructor) {
        setCourseName(courseName);
        setWorkLoad(workload);
        setInstructor(instructor);
    }

    public void setCourseName(String courseName){
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do curso não pode estar vazio.");
        } this.courseName = courseName;
    }

    public int getWorkLoad() {
        return workload;
    }
    public void setWorkLoad(int workload){
        if (workload <= 0){
            throw new IllegalArgumentException("A carga horária deve ser maior que zero.");
        } this.workload = workload;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor){
        if (instructor == null){
            throw new IllegalArgumentException("O instrutor não pode estar vazio.");
        } this.instructor = instructor;
    }

    public void displayDetails(){
        System.out.println("Nome do curso: " + courseName);
        System.out.println("Carga horária: " + workload + " horas");
        System.out.println("Instrutor: " + instructor.getName());
    }
}
