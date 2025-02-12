package com.hucs.behavioral.strategy;

class CommandModule {

    void executeManeuve(ManeuverStrategy strategy){
        strategy.execute();
    }

}
