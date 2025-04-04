public class PostgraduateStudent extends Student implements Assessment {

    public PostgraduateStudent(String name, int registration, double score) {
        super(name, registration, score);
    }

    @Override
    public double average(){
        return getScore() * 1.2;
    }
    
}
