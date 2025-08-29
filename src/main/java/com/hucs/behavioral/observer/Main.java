package com.hucs.behavioral.observer;

public class Main {
    public static void main(String[] a){

        ControlRoom basicControl = new ControlRoom("Nasa control");
        ControlRoom securityControl = new ControlRoom("Security control");

        Satellite weatherSat = new Satellite("Weather Sat");
        Satellite spySat = new Satellite("Spy Sat");

        weatherSat.addObserver(basicControl);
        weatherSat.addObserver(securityControl);
        weatherSat.addObserver(spySat);

        spySat.addObserver(securityControl);


        weatherSat.openSolarPanels();
        spySat.openSolarPanels();
    }
}
