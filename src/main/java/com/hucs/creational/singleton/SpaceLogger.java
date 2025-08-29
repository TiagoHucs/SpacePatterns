package com.hucs.creational.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class SpaceLogger {

    // Códigos ANSI para cores
    private static final String RESET = "\u001B[0m";
    private static final String VERMELHO = "\u001B[31m";
    private static final String VERDE = "\u001B[32m";
    private static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";

    private static final String FORMAT = "%s [%s] [%s] %s";

    private static SpaceLogger uniqueInstance;

    public static SpaceLogger getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SpaceLogger();
        }
        return uniqueInstance;
    }

    public void info(String msg) {
        System.out.println(String.format(FORMAT,AZUL,getTime(),"INFO", msg ));
    }

    public void warn(String msg) {
        System.out.println(String.format(FORMAT,AMARELO,getTime(),"WARN", msg ));
    }

    public void erro(String msg) {
        System.out.println(String.format(FORMAT,VERMELHO,getTime(),"ERRO", msg ));
    }

    private String getTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        return LocalDateTime.now().format(formatter);
    }

    public void status() {
        System.out.println(this.toString() + " active");
    }


}
