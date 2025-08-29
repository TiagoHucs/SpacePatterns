package com.hucs.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Satellite implements ISatellite, Observer{
    List<Observer> observers = new ArrayList<>();
    String name;

    public Satellite(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    private void notifyObservers(String msg) {
        for (Observer o: observers){
            o.inputMessage(msg);
        }
    }

    public void openSolarPanels() {
        this.notifyObservers(this.name + " - Solar pannels open");
    }

    @Override
    public void inputMessage(String message) {
        System.out.println("Satelite " + name + ": Alerta recebido - " + message);
    }
}
