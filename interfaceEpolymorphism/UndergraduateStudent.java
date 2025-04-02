public class UndergraduateStudent extends Student implements Assessment {

    public UndergraduateStudent(String name, int registration, double score) {
        super(name, registration, score);
    }

    @Override
    public double average(){
        return getScore() * 1.0;
    }
    
}
