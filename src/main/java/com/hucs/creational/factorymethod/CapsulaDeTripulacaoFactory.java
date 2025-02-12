package com.hucs.creational.factorymethod;

public class CapsulaDeTripulacaoFactory extends CapsulaFactory {
    @Override
    public Capsula build() {
        return new CapsulaDeTripulacao();
    }
}
