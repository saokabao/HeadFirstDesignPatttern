package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> lObserverList;

    WeatherStation(){
            lObserverList = new ArrayList<Observer>();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: lObserverList){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer obs) {


    }

    @Override
    public void registerObserver(Observer obs) {

    }
}
