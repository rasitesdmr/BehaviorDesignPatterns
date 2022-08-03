package Ob1;

import java.util.Observable;

public class NewsAgency extends Observable {

    public String news;

    public void setNews(String news){
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
