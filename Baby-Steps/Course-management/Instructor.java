public class Instructor{
    private String name;
    private String email;
    private String specialiation;

    public Instructor(String name, String email, String specialiation) {
        this.name = name;
        this.email = email;
        this.specialiation = specialiation;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do curso não pode ser vazio.");
        } this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("O email do curso não pode ser vazio.");
        } this.email = email;
    }

    public String getSpecialization() {
        return specialiation;
    }

    public void setSpecialization(String specialiation) {
        if (specialiation == null || specialiation.trim().isEmpty()) {
            throw new IllegalArgumentException("A especialização do curso não pode ser vazia.");
        } this.specialiation = specialiation;
    }

    public String displayDetails(){
        return "Instrutor: " + name + "\n" +
               "Email: " + email + "\n" +
               "Especialização: " + specialiation;
    }

}