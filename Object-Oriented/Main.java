public class Main{
    public static void main(String[]args){
        System.out.println("Design Patterns - Observer");
        System.out.println("Padrão de projeto que permite que um objeto notifique outros objetos sobre mudanças em seu estado.");

        News news = new News();
        User user1 = new User("Hudson");
        User user2 = new User("Lucas");
        

        news.addObserver(user1);
        news.addObserver(user2);
        

        news.setNews(" Padrões de projeto em Java!");
        news.setNews(" Estudar vale a pena!");
    }
}