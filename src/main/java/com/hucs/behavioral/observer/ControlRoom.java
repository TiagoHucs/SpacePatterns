package com.hucs.behavioral.observer;

class ControlRoom implements Observer{

    private String name;

    public ControlRoom(String name) {
        this.name = name;
    }

    @Override
    public void inputMessage(String message) {
        System.out.println(String.format("[%s] - MSG incomming: %s",name,message));
    }
}
