package com.hucs.structural.decorator;

class SistemaDeArmas extends NaveDecorator {

    SistemaDeArmas(INave nave) {
        super(nave);
    }

    @Override
    public void ativar() {
        super.ativar();
        ativarSistema();
    }

    public void ativarSistema(){
        System.out.println("Ativando Sistemas de Armas");
    }

}
