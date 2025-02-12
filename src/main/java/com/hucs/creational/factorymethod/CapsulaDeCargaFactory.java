package com.hucs.creational.factorymethod;

public class CapsulaDeCargaFactory extends CapsulaFactory {
    @Override
    public Capsula build() {
        return new CapsulaDeCarga();
    }
}
