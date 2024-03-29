package sample.subject;

import sample.observer.Observer;

public interface Subject {
    boolean addAsObserver(Observer observer);
    boolean removeFromObserver(Observer observer);
    boolean stateChanged();
    boolean notifyObserver();
}