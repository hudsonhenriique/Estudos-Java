import java.util.ArrayList;
import java.util.List;

public class News  {
    private List<Observer> observers = new ArrayList<>();
    private String newsContent;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String newsContent) {
        this.newsContent  = newsContent;
        notifyObservers();
    }
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(newsContent);
        }
    }
}
