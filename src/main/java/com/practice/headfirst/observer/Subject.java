package com.practice.headfirst.observer;

public interface Subject {
     void registerObserver(Observer observer);
     void removeObserver(int observer);
     void notifyObservers();
}
