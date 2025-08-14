package com.hucs.structural.decorator;

class SistemaDePropulsao extends NaveDecorator {

    SistemaDePropulsao(INave nave) {
        super(nave);
    }

    @Override
    public void ativar() {
        super.ativar();
        ligarMotor();
    }

    public void ligarMotor() {
        System.out.println("Ativando Sistemas de Propulsão");
    }
}
