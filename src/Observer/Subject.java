package Observer;

public interface Subject {
    public void notifyObserver();
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
}

